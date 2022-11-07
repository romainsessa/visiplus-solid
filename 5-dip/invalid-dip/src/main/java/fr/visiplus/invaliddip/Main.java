package fr.visiplus.invaliddip;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.visiplus.invaliddip.controller.ControllerImpl;
import fr.visiplus.invaliddip.view.ConsoleView;

public class Main {
	
	public static Logger logger = LoggerFactory.getLogger(Main.class);
	
	
	public static void main(String[] args) {
		logger.info("Welcome");
		
		ControllerImpl controller = new ControllerImpl(new ConsoleView());
		controller.execute();
	}

}
