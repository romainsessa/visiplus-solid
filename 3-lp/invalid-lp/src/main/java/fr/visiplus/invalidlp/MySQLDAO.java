package fr.visiplus.invalidlp;

import java.util.ArrayList;
import java.util.List;

public class MySQLDAO extends FileDAO { // erreur !

	public List<User> getDataFromMySQLDb() {
		//db called replaced by factice code
		List<User> result = new ArrayList<>();
		result.add(new User("fromDB1"));
		result.add(new User("fromDB2"));
		return result;
	}
}
