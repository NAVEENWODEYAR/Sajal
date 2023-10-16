package com.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test 
{
	private final static Logger log = LogManager.getLogger(Test.class);
	
	static public void getLog()
	{
		// Priorities, All>TRACE>DEBUG>INFO>WARN>ERROR>FATAL>OF
		System.out.println("\n Logging levels,");
		log.trace("\nFrom trace(),");
		log.info("\nFrom info(),");
		log.debug("\nFrom debug(),");
		log.warn("\nFrom warn(),");
		log.fatal("\nFrom fatal(),");
		log.error("\nFfom error(),");
	}
	
	static void doubleEquals()
	{
		int a = 10;
		int b = 10;
		
		System.out.println(a == b);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("\nWelcome");
		getLog();
		System.out.println("\n ************== **********");
		doubleEquals();
	}

}
