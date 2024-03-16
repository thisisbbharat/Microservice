package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class ClientController {

    @Value("${server.url}")
    private String serverUrl;

    @GetMapping("/ping-server")
    public String pingServer() {
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(serverUrl + "/api/ping", String.class);
        return "Response from Server: " + response;
    }
}
