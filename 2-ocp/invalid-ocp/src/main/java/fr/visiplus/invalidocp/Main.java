package fr.visiplus.invalidocp;

public class Main {

	public static void main(String[] args) {
		
		User user = new User("robert", UserType.USER);
		View view = new View();
		Controller controller = new Controller(view, user);
		controller.execute();
		
		// after change to :
//		User user = new User("robert", UserType.ADMIN);
//		View view = new View();
//		Controller controller = new Controller(view, user);
//		controller.execute();

	}

}
