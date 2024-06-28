package com.mrlonis.example.example_spring_boot_maven_app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class ExampleSpringBootMavenAppApplicationTests {

	@Test
	void contextLoads() {
	}

}
