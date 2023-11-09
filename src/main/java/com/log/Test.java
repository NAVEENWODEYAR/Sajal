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
		log.trace("\n From trace(),");
		log.info("\n From info(),");
		log.debug("\n From debug(),");
		log.warn("\n From warn(),");
		log.fatal("\n From fatal(),");
		log.error("\n From error(),");
	}
	
	static void doubleEquals()
	{
		int a = 10;
		int b = 10;
		
		System.out.println(a == b);
		int c = 20;
		System.out.println(a == c);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("\nWelcome");
		getLog();
		System.out.println("\n ************ == operator **********");
		doubleEquals();
	}

}
