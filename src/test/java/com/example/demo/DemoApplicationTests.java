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
		log.info("************In feature branch updated some app level code , this branch is cut off from develop branch************");
		log.info("**********Release branch have added new features is cut off from again develop branch then this branch will merge to develop and master");
		log.info("There bug in application so hotfix branch cut off from master and fixed the bug, Again will merge back to develop and master");
	}

}
