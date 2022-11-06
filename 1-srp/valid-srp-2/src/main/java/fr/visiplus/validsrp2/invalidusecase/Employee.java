package fr.visiplus.validsrp2.invalidusecase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Employee {

	public static Logger logger = LoggerFactory.getLogger(Employee.class);
	
	private int daysPerWeek = 5;
	private int hoursPerDay = 7;
	
	private int calculateHoursPerWeek() {
		return daysPerWeek * hoursPerDay;
	}
	
	public int provideToEmployeeHoursPerWeek() {
		int hours = calculateHoursPerWeek();
		logger.info("Hi Employee! Your contract indicates you have to work " + hours + " hours");
		return hours;
	}
	
	public int provideToHRWorkedHoursPerWeek() {
		logger.info("Hi HR! ");
		return calculateHoursPerWeek();
	}
	
}
