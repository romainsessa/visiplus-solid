package fr.visiplus.validip2.front;

import fr.visiplus.validdip2.repository.implementation.RepositoryImpl;
import fr.visiplus.validdip2.repository.interfaces.IRepository;
import fr.visiplus.validdip2.service.interfaces.IService;
import fr.visiplus.valididp2.service.implementations.ServiceImpl;

public class ConsoleApp {

	public static void main(String[] args) {
		IRepository repository = new RepositoryImpl();
		IService service = new ServiceImpl(repository);
		System.out.println(service.execute());
	}
	
}
