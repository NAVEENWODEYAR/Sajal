package com.junit;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import com.juint.Calci;

public class CalciTest1 
{

	Calci calci = new Calci();
	// 1. for testing add();
	@Test
	public void testAdd()
	{			
		int actual = calci.add(1, 1);
		int expected = 21;
		
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
