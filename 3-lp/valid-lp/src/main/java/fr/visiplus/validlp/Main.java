package fr.visiplus.validlp;

import fr.visiplus.validlp.data.Role;
import fr.visiplus.validlp.data.User;

public class Main {
	
	public static void main(String[] args) {
		
		DAO<User> uDao = new DatabaseImpl();		
		uDao.getData().forEach(System.out::println);
		
		DAO<Role> rDao = new APIImpl();
		rDao.getData().forEach(System.out::println);

		
	}

}
