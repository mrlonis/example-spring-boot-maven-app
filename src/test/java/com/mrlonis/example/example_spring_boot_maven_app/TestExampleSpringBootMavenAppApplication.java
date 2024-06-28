package com.mrlonis.example.example_spring_boot_maven_app;

import org.springframework.boot.SpringApplication;

public class TestExampleSpringBootMavenAppApplication {

    public static void main(String[] args) {
        SpringApplication.from(ExampleSpringBootMavenAppApplication::main).with(TestcontainersConfiguration.class)
                .run(args);
    }

}
