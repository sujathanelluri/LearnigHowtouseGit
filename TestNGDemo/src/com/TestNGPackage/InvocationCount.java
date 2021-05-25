package com.TestNGPackage;

import org.testng.annotations.Test;

public class InvocationCount 
{
	
	@Test(invocationCount=6)
    public void sum() 
	{
		int a=10;
		int b=20;
		int c = a+b;
		System.out.println("sum  : " +c);
    }

	
}
