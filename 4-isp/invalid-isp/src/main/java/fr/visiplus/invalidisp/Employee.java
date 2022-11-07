package fr.visiplus.invalidisp;

public class Employee implements Human {

	public void display() {
		System.out.println("I'm an Employee");
	}

	public void makeDirectorStuff() throws Exception {
		throw new Exception("Not my job!");
	}

}
