package com.example.consumingrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BundesService {

    @Autowired
    RestTemplate restTemplate;

    protected BundesResponse[] getBundesResponse() {

        String apiUrl = "https://bundesliga-standings.p.rapidapi.com"; // Reemplaza con la URL correcta

        BundesResponse data[] = restTemplate.getForObject(
                apiUrl, BundesResponse[].class);

        return data;
    }
}
