package com.training.bms;

import static org.assertj.core.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MessagingApiAppApplicationTests {

	@Test
	void contextLoads() {
//		assertEquals(200,200);
	}
	
    @Test
    public void intentionallyFailingTest() {
        fail("This testntionally fails.");
    }

}
