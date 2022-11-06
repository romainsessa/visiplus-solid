package fr.visiplus.invalidocp;

public class View {

	public void display(User user) {

		System.out.println("Welcome user : " + user.getUsername());	
		
		//After : second version with regression !
		//if(user.getType().equals(UserType.ADMIN)) {
		//	System.out.println("Welcome admin : " + user.getUsername());
		//}
	}

}
