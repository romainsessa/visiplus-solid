package fr.visiplus.validocp;

public class UserView implements View {

	@Override
	public void display(User user) {
		System.out.println("Welcome User! " + user.getUsername());		
	}

		
}
