package com.example.Containerized.microservice.SecondApplication.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.Containerized.microservice.SecondApplication.dto.Messagedto;

@RestController
public class SecondApplication {

    @Value("${FirstApplication.url}")
    private String FirstApplication;

    @GetMapping("/reverse")
    public Messagedto getReversedMessage() {
        RestTemplate restTemplate = new RestTemplate();
        Messagedto message = restTemplate.getForObject(FirstApplication + "/hello", Messagedto.class);
        String reversedMessage = new StringBuilder(message.getMessage()).reverse().toString();
        return new Messagedto(message.getId(), reversedMessage);
    }
}
