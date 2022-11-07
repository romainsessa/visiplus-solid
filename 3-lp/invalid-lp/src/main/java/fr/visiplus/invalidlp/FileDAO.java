package fr.visiplus.invalidlp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileDAO implements DAO {

	@Override
	public List<User> getDataFromFile() {
		String filepath = "users.txt";
		ArrayList<User> result = new ArrayList<User>();
		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader(filepath));
				String line = reader.readLine();

				while (line != null) {
					result.add(new User(line));
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

}
