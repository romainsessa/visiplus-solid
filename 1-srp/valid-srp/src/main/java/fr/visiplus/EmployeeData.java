package fr.visiplus;

public class EmployeeData {

	private int hoursPerDay = 7;
	
	private int dayPerWeek = 5;
	
	//to add after
	private int workedHoursPerDay = 8;
	
	public int getDayPerWeek() {
		return dayPerWeek;
	}
	
	public int getHoursPerDay() {
		return hoursPerDay;
	}
	
	public int getWorkedHoursPerDay() {
		return workedHoursPerDay;
	}
	
	public void setDayPerWeek(int dayPerWeek) {
		this.dayPerWeek = dayPerWeek;
	}
	
	public void setHoursPerDay(int hoursPerDay) {
		this.hoursPerDay = hoursPerDay;
	}
	
	public void setWorkedHoursPerDay(int workedHoursPerDay) {
		this.workedHoursPerDay = workedHoursPerDay;
	}
	
}
