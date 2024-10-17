package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Testing1ApplicationTests {
	@Test
	public void additiontest()
	{
		assertEquals(20,Calculator.add(10,10));
	}
	@Test
	public void subtest()
	{
		assertEquals(20,Calculator.sub(30,10));
	}
	@Test
	public void multest()
	{
		assertEquals(20,Calculator.mul(10,2));
	}
	@Test
	public void divtest()
	{
		assertEquals(2,Calculator.div(10,5));
	}
	
}