package fr.visiplus.validdip.service;

import fr.visiplus.validdip.repository.Repository;

public class ServiceImpl implements Service {

	private Repository repository;
	
	public Repository getRepository() {
		return repository;
	}
	
	public void setRepository(Repository repository) {
		this.repository = repository;
	}
	
	public ServiceImpl(Repository repository) {
		this.repository = repository;
	}
	
	@Override
	public String execute() {
		return this.repository.getData();		
	}

}
