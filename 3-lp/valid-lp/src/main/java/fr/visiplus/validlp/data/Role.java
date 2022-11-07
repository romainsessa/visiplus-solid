package fr.visiplus.validlp.data;

public class Role {
	
	private String roleName;
	
	public String getName() {
		return roleName;
	}
	
	public void setName(String roleName) {
		this.roleName = roleName;
	}
	
	public Role(String roleName) {
		this.roleName = roleName;
	}
	
	@Override
	public String toString() {
		return roleName;
	}

}
