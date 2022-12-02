package com.example.spring_backend_example;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExampleService {

    private final ExampleRepository repository;

    public String getHelloWorld() {
        return repository.getHelloWorld();
    }
}
