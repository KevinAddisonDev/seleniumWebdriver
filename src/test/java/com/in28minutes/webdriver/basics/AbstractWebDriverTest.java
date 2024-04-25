package com.in28minutes.webdriver.basics;

import java.awt.print.Printable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class AbstractWebDriverTest {

	protected WebDriver driver;

	public AbstractWebDriverTest() {
		super();
	}

	@BeforeTest
	public void beforeTest() {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  
		 
		
	}

	@AfterTest
	public void afterTest() {
		  driver.quit();
		  
	  }
	
	public void sleep(int seconds) {
		try{
		Thread.sleep(seconds *1000);}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}