package org.test;

import org.testng.annotations.Test;

public class pioty {
@Test(priority=-2)
public void test5() {
	System.out.println("test5");
}

@Test(priority=5)
public void test2() {
	System.out.println("test2");
}

@Test(priority=0)
public void test1() {
	System.out.println("test1");
}

@Test(priority=-1)
public void test3() {
	System.out.println("test3");
}
}
