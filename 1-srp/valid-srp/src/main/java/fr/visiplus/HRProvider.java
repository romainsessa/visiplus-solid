package fr.visiplus;

public class HRProvider {

	private EmployeeData data;

	public EmployeeData getData() {
		return data;
	}

	public void setData(EmployeeData data) {
		this.data = data;
	}
	
	public HRProvider(EmployeeData data) {
		this.data = data;
	}
	
	public int provideWorkedHoursPerWeek() {
		return data.getWorkedHoursPerDay() * data.getDayPerWeek(); // ajout d'un commentaire factice
	}

}
