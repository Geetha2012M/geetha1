package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\geethu\\Facebook\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("emial")).sendKeys("bhanu");
	driver.findElement(By.id("pass")).sendKeys("password");
	driver.findElement(By.xpath("//input[@value='Log In']")).click();
	
	
	}
	

}
