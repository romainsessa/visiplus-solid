package fr.visiplus;

public class EmployeeProvider {

	private EmployeeData data;
	
	public EmployeeData getData() {
		return data;
	}
	
	public void setData(EmployeeData data) {
		this.data = data;
	}
	
	public EmployeeProvider(EmployeeData data) {
		this.data = data;
	}
	
	public int provideHoursPerWeek() {
		return data.getDayPerWeek() * data.getHoursPerDay();
	}
	
}
