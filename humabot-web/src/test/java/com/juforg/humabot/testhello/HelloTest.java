package com.juforg.humabot.testhello;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.juforg.humabot.helloworld.Hello;

public class HelloTest {
	@Test
	public void testSayHello(){
		Hello h = new Hello();
		String r = h.sayHello();
		assertEquals("Hello worl",r);
	}
}
