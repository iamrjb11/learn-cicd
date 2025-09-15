package com.docker.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	@DisplayName("First Test")
	void testMe() {
		int v=10;
		Assertions.assertEquals(10, v);

	}

}
