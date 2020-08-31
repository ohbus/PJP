package com.subho.wipro.pjp.tm04.JunitWithEclipse.Assignment01;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Demo1Test {
	
	Demo1 demo1 = new Demo1();
	
	@Test
	public void testStringConcat() {
		assertEquals("tomcat", demo1.stringConcat("tom", "cat"));
	}

}
