package fr.visiplus.console;

import fr.visiplus.sharedcomponent.SharedService;

public class Controller {
	
	private View view;
	private SharedService service;
	
	public View getView() {
		return view;
	}
	
	public void setView(View view) {
		this.view = view;
	}
	
	public SharedService getService() {
		return service;
	}
	
	public void setService(SharedService service) {
		this.service = service;
	}
	
	public Controller(SharedService service, View view) {
		this.service = service;
		this.view = view;
	}

	public void execute() {
		this.view.display(this.service.getSharedValue());
	}
	
}
