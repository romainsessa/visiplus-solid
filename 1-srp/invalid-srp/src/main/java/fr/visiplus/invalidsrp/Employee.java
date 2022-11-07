package fr.visiplus.invalidsrp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Employee {

	public static Logger logger = LoggerFactory.getLogger(Employee.class);

	private int daysPerWeek = 5;
	//private int workedHoursPerDay = 8; add it after
	private int hoursPerDay = 7;
	
	private int calculateHoursPerWeek() {
		return daysPerWeek * hoursPerDay;
		// change to :
		//return daysPerWeek * workedHoursPerDay;
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
