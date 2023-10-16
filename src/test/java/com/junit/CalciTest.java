package com.junit;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.juint.Calci;

public class CalciTest 
{
	private static Calci calci = null;
	
	@BeforeClass
	public static void beforeAll()
	{
	// Object creation,
		calci = new Calci();
	}
	
	@AfterClass
	public static void  afterAll()
	{
		calci = null;
	}
	
	// 1. for testing add();
	@Test
	public void testAdd()
	{			
		int actual = calci.add(1, 1);
		int expected = 2;
		
		// check both the values,
		assertEquals(expected, actual);
	}
	
	// 2. for testing sub(),
	@Test
	public void testSub()
	{		
		int actual = calci.sub(1, 1);
		int expected = 0;
		
		assertEquals(expected, actual);
	}
}
