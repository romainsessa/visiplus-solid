package fr.visiplus.invalidisp;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	public static Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {

		logger.info("Welcome");

		List<Human> resources = new ArrayList<Human>();
		resources.add(new Contractor());
		resources.add(new Director());
		resources.add(new Employee());

		for (Human h : resources) {
			h.display();
			try {
				h.makeDirectorStuff();
			} catch (Exception e) {
				logger.error("something wrong!");
			}
		}

	}

}
