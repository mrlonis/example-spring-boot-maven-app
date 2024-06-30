package com.mrlonis.example;

import org.springframework.boot.SpringApplication;

public class TestExampleSpringBootMavenAppApplication {

    public static void main(String[] args) {
        SpringApplication.from(Application::main)
                .with(TestcontainersConfiguration.class)
                .run(args);
    }
}
