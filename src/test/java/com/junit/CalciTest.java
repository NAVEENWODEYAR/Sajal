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
}
