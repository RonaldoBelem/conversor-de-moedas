# Etapa 1: Construir o aplicativo
FROM maven:3.8.8-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Etapa 2: Criar a imagem do aplicativo
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY --from=build /app/target/conversor-de-moedas-0.0.1-SNAPSHOT.jar ./app.jar

# Expor a porta que o aplicativo escuta
EXPOSE 8080

# Comando para rodar o aplicativo
ENTRYPOINT ["java", "-jar", "app.jar"]
