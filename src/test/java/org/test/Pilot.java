package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pilot {
	@parameters({"user","pass"})
	@Test
	public void test1(String s1,String s2) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\HorsePro\\div\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("String s1");
		driver.findElement(By.id("pass")).sendKeys("String s2");
		driver.findElement(By.id("login button")).click();
		
	}

}
