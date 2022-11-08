package fr.visiplus.validdip;

import fr.visiplus.validdip.controller.Controller;
import fr.visiplus.validdip.repository.Repository;
import fr.visiplus.validdip.repository.RepositoryImpl;
import fr.visiplus.validdip.service.Service;
import fr.visiplus.validdip.service.ServiceImpl;

public class Main {

	public static void main(String[] args) {
		Repository repository = new RepositoryImpl();
		Service service = new ServiceImpl(repository);
		Controller ctl = new Controller(service);
		ctl.execute();
	}
	
	
	
	
}
