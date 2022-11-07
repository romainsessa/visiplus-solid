package fr.visiplus.invaliddip.service;

import fr.visiplus.invaliddip.repository.RepositoryImpl;

public class ServiceImpl {
	
	public String execute() {
		
		RepositoryImpl repo = new RepositoryImpl();
		return repo.getData();
		
	}

}
