package fr.visiplus.validdip.controller;

import fr.visiplus.validdip.service.Service;
import fr.visiplus.validdip.view.ConsoleView;

public class Controller {

	private Service service;
	
	public Service getService() {
		return service;
	}
	
	public void setService(Service service) {
		this.service = service;
	}
	
	public Controller(Service service) {
		this.service = service;
	}
	
	public void execute() {
		ConsoleView.display(service.execute());
	}
	
	
}
