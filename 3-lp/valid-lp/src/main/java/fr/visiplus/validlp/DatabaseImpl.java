package fr.visiplus.validlp;

import java.util.ArrayList;
import java.util.List;

import fr.visiplus.validlp.data.User;

public class DatabaseImpl implements DAO<User> {

	public List<User> getData() {
		// simulation de l'appel à la db avec du code factice
		List<User> result = new ArrayList<>();
		result.add(new User("robert"));
		result.add(new User("romain"));	
		return result;
	}

}
