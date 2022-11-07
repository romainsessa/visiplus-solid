package fr.visiplus.invalidlp;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		DAO fileDAO = new FileDAO();
		List<User> list = fileDAO.getDataFromFile();
		list.forEach(System.out::println);
	
		MySQLDAO dbDAO = new MySQLDAO();
		list = dbDAO.getDataFromMySQLDb();
		list.forEach(System.out::println);
		
		list = dbDAO.getDataFromFile();
		list.forEach(System.out::println);

	}

}
