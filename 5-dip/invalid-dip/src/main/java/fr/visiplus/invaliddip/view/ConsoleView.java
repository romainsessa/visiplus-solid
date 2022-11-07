package fr.visiplus.invaliddip.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConsoleView {
	
	public static Logger logger = LoggerFactory.getLogger(ConsoleView.class);
	
	public void display(String data) {
		logger.info(data);
	}

}
