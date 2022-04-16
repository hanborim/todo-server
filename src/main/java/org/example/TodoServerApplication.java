package org.example;

import org.example.repository.TodoRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//api 상세
//https://docs.google.com/spreadsheets/d/1c9QSRGHTvMZ5fuuAmxQhyQo0Y8giXFq7mpgaaIB4e0A/edit?usp=sharing

@SpringBootApplication
public class TodoServerApplication {
    public static void main(String[] args) {
        System.out.println("hello todo");
        SpringApplication.run(TodoServerApplication.class, args);
    }
}
