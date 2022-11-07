package fr.visiplus.invaliddip.controller;

import fr.visiplus.invaliddip.service.Service2Impl;
import fr.visiplus.invaliddip.service.ServiceImpl;
import fr.visiplus.invaliddip.view.ConsoleView;

public class ControllerImpl {

	private ConsoleView view;
	
	public ControllerImpl(ConsoleView view) {
		this.view = view;
	}
	
	public void execute() {
		
//		ServiceImpl service = new ServiceImpl();
//		String data = service.execute();
		
		Service2Impl service2 = new Service2Impl();
		String data = service2.getData();
		
		this.view.display(data);	
		
	}
	
	
	
}
