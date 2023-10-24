package com.juint;

public class TestClass
{

	public static void main(String[] args) 
	{
		var c = new Calci();
		
		// test the methods manually,
		int a = 2;
		int b = 2;
		
		System.out.println("Nmbers for the calculation,"+a+" and "+b);
		int sum = c.add(a, b);		// 4
		System.out.println("\n Sum of numbers:"+sum);
		
		int diff = c.sub(a, b);		// 0
		System.out.println("\n Difference of numbers:"+diff);
		
		int prod = c.mult(a, b);	// 4
		System.out.println("\n Product of numbers:"+prod);
		
		float div = c.div(a, b);		// 1
		System.out.println("\n Division of numbers:"+div);
	}

}
