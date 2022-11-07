package com.visiplus.lp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import fr.visiplus.validlp.APIImpl;
import fr.visiplus.validlp.DAO;
import fr.visiplus.validlp.data.Role;

public class APIImplTest {
	
	@Test
	public void testGetData() {
		
		String expectedRoleName = "admin";
		DAO<Role> apiDao = new APIImpl();
		
		String result = apiDao.getData().getName();
		
		assertEquals(expectedRoleName, result);
		
		
	}

}
