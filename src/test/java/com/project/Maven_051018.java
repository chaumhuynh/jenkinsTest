package com.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

public class Maven_051018 {

	WebDriver driver;
	@Test (description = "Maven Test")
	public void mavenTest() {
	System.out.println("Hello World...");
	
	System.setProperty("phantomjs.binary.path", "C:\\Users\\Chau\\Downloads\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
	driver = new PhantomJSDriver();
	driver.get("http://google.com");
	
	driver.findElement(By.xpath("//a[contains(.,'Gmail')]")).click();
	
	String title = driver.getCurrentUrl();
	System.out.println(title);
}
}
