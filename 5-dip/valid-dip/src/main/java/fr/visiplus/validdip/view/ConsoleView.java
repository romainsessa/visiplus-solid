package fr.visiplus.validdip.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConsoleView {

	public static Logger logger = LoggerFactory.getLogger(ConsoleView.class);

	public static void display(String text) {
		logger.info(text);
	}
	
}
