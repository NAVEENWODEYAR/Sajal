package com.juint;

public class TestClass
{

	public static void main(String[] args) 
	{
		Calci c = new Calci();
		
		// test the methods manually,
		int a = 2;
		int b = 2;
		
		System.out.println("Nmbers for the calculation,"+a+" and "+b);
		int sum = c.add(a, b);		// 4
		System.out.println("\n 1.Sum of numbers:"+sum);
		
		int diff = c.sub(a, b);		// 0
		System.out.println("\n 2.Difference of numbers:"+diff);
		
		int prod = c.mult(a, b);	// 4
		System.out.println("\n 3.Product of numbers:"+prod);
		
		float div = c.div(a, b);		// 1
		System.out.println("\n 4.Division of numbers:"+div);
	}

}
