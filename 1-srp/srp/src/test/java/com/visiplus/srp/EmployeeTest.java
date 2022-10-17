package com.visiplus.srp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EmployeeTest {

	@Test
	public void testGetHours() {
		int expectedResult = 35;
		Employee e = new Employee();
		
		int result = e.getHours();
		
		assertEquals(expectedResult, result);		
	}
	
	
}
