package fr.visiplus.validlp;

import java.util.ArrayList;
import java.util.List;

import fr.visiplus.validlp.data.Role;

public class APIImpl implements DAO<Role> {

	public List<Role> getData() {
		// simulation de l'appel à l'API par un code factices
		List<Role> result = new ArrayList<>();
		result.add(new Role("ADMIN"));
		result.add(new Role("USER"));		
		return result;
	}

	
	
}
