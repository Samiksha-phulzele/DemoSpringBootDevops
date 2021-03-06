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
		log.info("**********Release branch have added new features");
		log.info("There bug in application so hotfix branch cut off from master and fixed the bug");
	}

}
