package fr.visiplus.validocp;

public class Main {

	public static void main(String[] args) {
		
		User user = new User("robert", UserType.USER);
//		User user = new User("robert", UserType.ADMIN);

		View view = new UserView();
//		View view = new AdminView();
		Controller controller = new Controller(view, user);
		controller.execute();
		
	}

}
