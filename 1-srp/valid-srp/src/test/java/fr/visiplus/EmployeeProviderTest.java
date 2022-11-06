package fr.visiplus;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EmployeeProviderTest {

	@Test
	public void testProvideHoursPerWeek() {
		int expected = 35;
		EmployeeData data = new EmployeeData();
		EmployeeProvider provider = new EmployeeProvider(data);
		
		int result = provider.provideHoursPerWeek();
		
		assertEquals(expected, result);
	}
	
}
