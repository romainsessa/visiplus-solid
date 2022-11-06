package fr.visiplus.console;

import fr.visiplus.sharedcomponent.SharedService;

public class ConsoleApp {

	public static void main(String[] args) {
				
		SharedService service = new SharedService();
		View view = new View();
		
		Controller ctl = new Controller(service, view);
		ctl.execute();
		
	}
	
}
