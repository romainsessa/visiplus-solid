package fr.visiplus.valididp2.service.implementations;

import fr.visiplus.validdip2.repository.interfaces.IRepository;
import fr.visiplus.validdip2.service.interfaces.IService;

public class ServiceImpl implements IService {

	private IRepository repository;
	
	public IRepository getRepository() {
		return repository;
	}
	
	public void setRepository(IRepository repository) {
		this.repository = repository;
	}
	
	public ServiceImpl(IRepository repository) {
		this.repository = repository;		
	}
	
	public String execute() {
		return repository.getData();
	}

}
