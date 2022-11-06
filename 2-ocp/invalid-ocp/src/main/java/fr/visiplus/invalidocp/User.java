package fr.visiplus.invalidocp;

public class User {
	
	private String username;
	private UserType type;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public UserType getType() {
		return type;
	}
	
	public User(String username, UserType type) {
		this.username = username;
		this.type = type;
	}
	
}
