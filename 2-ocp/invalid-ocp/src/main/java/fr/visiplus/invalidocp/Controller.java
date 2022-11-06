package fr.visiplus.invalidocp;

public class Controller {

	private View view;
	private User user;

	public View getView() {
		return view;
	}
	
	public void setView(View view) {
		this.view = view;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public Controller(View view, User user) {
		this.view = view;
		this.user = user;
	}

	public void execute() {
		this.view.display(user);
	}

}
