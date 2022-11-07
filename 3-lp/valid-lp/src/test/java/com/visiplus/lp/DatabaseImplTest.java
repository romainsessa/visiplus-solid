package com.visiplus.lp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import fr.visiplus.validlp.DAO;
import fr.visiplus.validlp.DatabaseImpl;
import fr.visiplus.validlp.data.Role;
import fr.visiplus.validlp.data.User;

public class DatabaseImplTest {
	
	@Test
	public void testGetData() {
		
		String expectedUserName = "toto";
		DAO<User> databaseDao = new DatabaseImpl();
		
		String result = databaseDao.getData().getUsername();
		
		assertEquals(expectedUserName, result);
		
		
	}

}
