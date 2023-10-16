package com.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.juint.Calci;

public class CalciTest 
{
	@Test
	public void testAdd()
	{	
		// Object creation,
		var calci = new Calci();
		
		int actual = calci.add(1, 1);
		int expected = 2;
		
		// check both the values,
		assertEquals(expected, actual);
	}
	
	// for testing sub(),
	@Test
	public void testSub()
	{
		var calci = new Calci();
		
		int actual = calci.sub(1, 1);
		int expected = 01;
		
		assertEquals(expected, actual);
	}
}
