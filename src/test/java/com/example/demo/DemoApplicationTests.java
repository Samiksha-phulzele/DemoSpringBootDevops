package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class DemoApplicationTests {

	@Test
	void contextLoads() {
		log.info("************In master branch************");
		log.info("************In develop branch************");
		log.info("************In feature branch updated some app level code ************");
		log.info("**********Release1.0 branch have added new features");
	}

}
