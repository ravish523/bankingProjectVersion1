package com.bankingProject.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class log4j {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Logger logger = Logger.getLogger("log4j");
		PropertyConfigurator.configure("Log4j.properties");
		logger.info("hi this is ravish");
		logger.warn("i am danger");

	}

}
