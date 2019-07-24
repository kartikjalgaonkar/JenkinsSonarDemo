package com.yash;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.yash.demo.HelloController;

public class HelloControllerTest {

	//@Autowired
	private HelloController helloController;
	
	@Before
	public void setUp() {
		helloController = new HelloController();
	}
	
	@Test
	public void shouldReturnHelloYash() {
		assertEquals("hello Yash!!", helloController.GetHello());
	}
}
