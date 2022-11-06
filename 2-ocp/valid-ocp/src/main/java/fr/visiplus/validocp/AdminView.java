package fr.visiplus.validocp;

public class AdminView implements View {

	@Override
	public void display(User user) {
		System.out.println("Welcome admin! " + user.getUsername());		
	}

}
