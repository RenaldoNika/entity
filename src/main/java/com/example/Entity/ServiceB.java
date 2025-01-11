package com.example.Entity;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ServiceB {

    RestTemplate restTemplate;

    public ServiceB(RestTemplate restTemplate){
        this.restTemplate=restTemplate;
    }



    @GetMapping("/callServiceB/{id}")
    public String callServiceB(@PathVariable ("id") int id) {
        // Dërgo id te Service B
        String url = "http://localhost:8082/findPerson/" + id;
        String response = restTemplate.getForObject(url, String.class);
        return "Response from Service A: " + response;
    }
}
