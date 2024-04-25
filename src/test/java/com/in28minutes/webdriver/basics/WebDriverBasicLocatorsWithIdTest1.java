package com.in28minutes.webdriver.basics;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBasicLocatorsWithIdTest1 extends AbstractWebDriverTest {

	
  @Test
  public void testTitle() {
	  
	  driver.get("http://localhost:8080/login");
	  String actualTitle = driver.getTitle();  
	  String expectedTitle = "First Web Application";
	  
	  assertEquals(actualTitle, expectedTitle);
	
  }
  
  @Test
  public void testGetInformationAboutName() {
	  driver.get("http://localhost:8080/login");
	  WebElement namElement = driver.findElement(By.id("name"));
	  System.out.println(namElement.getTagName());  
	  System.out.println(namElement.getAttribute("type")); 
  }
  
  @Test
  public void testGetInformationAboutPassword() {
	  driver.get("http://localhost:8080/login");
	  WebElement passwordElement = driver.findElement(By.id("password"));
	  System.out.println(passwordElement.getTagName());  
	  System.out.println(passwordElement.getAttribute("type")); 
  }
  
  @Test
  public void testGetInformationAboutSubmit() {
	  driver.get("http://localhost:8080/login");
	  WebElement submitElement = driver.findElement(By.id("submit"));
	  System.out.println(submitElement.getTagName());  
	  System.out.println(submitElement.getAttribute("type")); 
	  System.out.println(submitElement.getAttribute("value"));
  }
  
}
