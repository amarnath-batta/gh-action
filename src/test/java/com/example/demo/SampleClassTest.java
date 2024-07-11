package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SampleClassTest {
	
	@Test
	public void testAdd() {
		SampleClass obj = new SampleClass();
		int sum = obj.add(1, 2);
		assertEquals(3, sum);
	}

}
