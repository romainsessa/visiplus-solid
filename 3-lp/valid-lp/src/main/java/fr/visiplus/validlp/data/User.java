package fr.visiplus.validlp.data;

public class User {
	
	private String username;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public User(String username) {
		this.username = username;
	}
	
	@Override
	public String toString() {
		return username;
	}

}
