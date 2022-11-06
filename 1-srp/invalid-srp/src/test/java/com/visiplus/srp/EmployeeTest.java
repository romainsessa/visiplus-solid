package com.visiplus.srp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import fr.visiplus.invalidsrp.Employee;

public class EmployeeTest {

	@Test
	public void testProvideToEmployeeHoursPerWeek() {
		int expectedResult = 35;
		Employee e = new Employee();

		int result = e.provideToEmployeeHoursPerWeek();
		
		assertEquals(expectedResult, result);		
	}
	
	
}
