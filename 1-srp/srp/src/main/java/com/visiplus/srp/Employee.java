package com.visiplus.srp;

public class Employee {

	private int contractHours = 35;
	private int workedHours = 40;
	
	public int getHoursPerDay() {
		return getHours() / 5;
	}
	
	public int getTotalHoursInAMonth() {
		return getHours() * 4;
	} 	
	
	public int getHours() {		
		return contractHours;
	}
	
}
