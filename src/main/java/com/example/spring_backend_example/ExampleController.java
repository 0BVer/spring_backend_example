package com.example.spring_backend_example;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class ExampleController {

    private final ExampleService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String getHelloWorld() {
        return service.getHelloWorld();
    }
}
