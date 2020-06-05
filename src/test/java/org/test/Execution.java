package org.test;

import org.testng.annotations.Test;

public class Execution {
	@Test(invocationCount=5)
	public void test2() {
		System.out.println("java");}
	
@Test()
public void test1() {
System.out.println("selenium");
}
}