# Conversor de Moedas com Spring Boot, Thymeleaf e Docker

Este projeto é um conversor de moedas desenvolvido em Java usando o framework Spring Boot e Thymeleaf como engine de template para o frontend. Ele utiliza a API [ExchangeRate API](https://www.exchangerate-api.com/) para obter as taxas de câmbio em tempo real. Além disso, o projeto foi containerizado utilizando Docker para facilitar o processo de deploy e execução em diferentes ambientes.

## Funcionalidades

- Conversão de moedas entre diferentes países.
- Suporte para seleção de moeda de origem e destino.
- Exibição do resultado da conversão formatado com duas casas decimais.
- **Docker**: Facilita o deploy e a execução do projeto em ambientes isolados, garantindo consistência nas execuções.

## Tecnologias Utilizadas

- **Java 17+**: Linguagem de programação principal.
- **Spring Boot**: Framework para desenvolvimento da aplicação.
    - **Spring Web**: Para criar a API e lidar com requisições HTTP.
    - **Thymeleaf**: Para renderizar as páginas HTML no frontend.
- **ExchangeRate API**: API de terceiros para obter taxas de câmbio.
- **Gson**: Biblioteca para manipulação de JSON.
- **Docker**: Para containerização da aplicação, permitindo fácil deploy e escalabilidade.

## Pré-requisitos

1. **JDK 17+**: Instale a versão mais recente do Java Development Kit.
2. **Maven**: Utilize o Maven para gerenciar dependências.
3. **Chave de API da ExchangeRate API**: Crie uma conta no site [ExchangeRate API](https://www.exchangerate-api.com/) e obtenha uma chave de API gratuita.
4. **Docker**: Certifique-se de que o Docker está instalado em seu sistema para rodar o projeto em containers.

## Configuração do Projeto

### 1. Clonar o Repositório

Clone este repositório em sua máquina local:

```bash
git clone https://github.com/RonaldoBelem/conversor-de-moedas.git
cd conversor-de-moedas
