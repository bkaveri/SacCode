package org.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Problem {
@Parameters({"username","password"})
@Test()
public void test5(String s1,String s2) {
	System.out.println(s1);
	System.out.println(s2);
}
@Parameters({"password"})
@Test()
public void test1(String s1) {
	System.out.println(s1);


}
}