package com.example.spring_backend_example;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ExampleRepository {

    private static final String HELLO_WORLD = "Hello World";
    private static final List<String> wordList = new ArrayList<>();

    public String getHelloWorld() {
        return HELLO_WORLD;
    }
}
