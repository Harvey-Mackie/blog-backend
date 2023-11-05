package com.personal.blog;

import com.personal.blog.repository.SubscriberRepository;
import com.personal.blog.service.ActionService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource(
		locations = "classpath:application-integrationtest.properties"
)
class BlogApplicationTests {

	@Autowired
	private ActionService actionService;

	@Autowired
	private SubscriberRepository subscriberRepository;

	@Test
	void addSubscriberShouldPass() {
		Assertions.assertEquals(0, subscriberRepository.findAll().size());
		actionService.subscribe("Steven", "Steven@mailinator.com");
		Assertions.assertEquals(1, subscriberRepository.findAll().size());
	}

	@Test
	void addDuplicateSubscriberShouldFail() {
		Assertions.assertEquals(0, subscriberRepository.findAll().size());
		actionService.subscribe("Steven", "Steven@mailinator.com");
		actionService.subscribe("Steven", "Steven@mailinator.com");
		Assertions.assertEquals(1, subscriberRepository.findAll().size());
	}

}
