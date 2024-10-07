package com.conversordemoedas.conversor.de.moedas;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConversorService {
    private final String API_URL = "https://v6.exchangerate-api.com/v6/285dac9f3987a4c5c7689103";


    public double converter(String moedaOrigem, String moedaDestino, double valor) {
        try {
            String url = API_URL + "/pair/" + moedaOrigem + "/" + moedaDestino;
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

            if (response.getStatusCode().is2xxSuccessful()) {
                JSONObject json = new JSONObject(response.getBody());
                double taxa = json.getDouble("conversion_rate");
                return valor * taxa;
            } else {
                throw new RuntimeException("Erro ao obter a taxa de câmbio");
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao converter moeda", e);
        }
    }
}
