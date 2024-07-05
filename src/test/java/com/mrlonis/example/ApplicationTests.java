package com.mrlonis.example;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
@ActiveProfiles("test")
class ApplicationTests {

    @Autowired
    Environment environment;

    @Test
    void testContextLoads() {
        assertTrue(Arrays.asList(environment.getActiveProfiles()).contains("test"));
    }
}
