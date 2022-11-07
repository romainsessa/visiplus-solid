package fr.visiplus.invalidisp;

public class Contractor implements Human {

	public void display() {
		System.out.println("I'm a contractor");
	}

	public void makeDirectorStuff() throws Exception {
		throw new Exception("Not my job!");
	}

}
