package com.in28minutes.webdriver.basics;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
 
public class WebDriverBasicLocatorsWithNameTest extends AbstractWebDriverTest {
	@Test
  public void testTitle() {
	  
	  driver.get("http://localhost:8080/pages/login.html");
	  String actualTitle = driver.getTitle();  
	  String expectedTitle = "SB Admin 2 - Bootstrap Admin Theme";
	  
	  assertEquals(actualTitle, expectedTitle);
	
  }
  
  @Test
  public void testGetInformationAboutEmail() {
	  driver.get("http://localhost:8080/pages/login.html");
	  WebElement namElement = driver.findElement(By.name("email"));
	  System.out.println(namElement.getTagName());  
	  System.out.println(namElement.getAttribute("class")); 
	  System.out.println(namElement.getAttribute("placeholder")); 
	  System.out.println(namElement.getAttribute("value")); 
  }
  
  @Test
  public void testGetInformationAboutPassword() {
	  driver.get("http://localhost:8080/pages/login.html");
	  WebElement passwordElement = driver.findElement(By.name("password"));
	  System.out.println(passwordElement.getTagName());  
	  System.out.println(passwordElement.getAttribute("class")); 
	  System.out.println(passwordElement.getAttribute("placeholder")); 
	  System.out.println(passwordElement.getAttribute("value")); 
  }
  
  @Test
  public void testGetInformationAboutRememberMe() {
	  driver.get("http://localhost:8080/pages/login.html");
	  WebElement rememberMElement = driver.findElement(By.name("remember"));
	  System.out.println(rememberMElement.getTagName());  
	  System.out.println(rememberMElement.getAttribute("class")); 
	  System.out.println(rememberMElement.getAttribute("type")); 
	  System.out.println(rememberMElement.getAttribute("value"));
  }
  
  @Test
  @Ignore
  public void testGetInformationAboutLoginButton() {
	  driver.get("http://localhost:8080/pages/login.html");
	  WebElement submitElement = driver.findElement(By.className("btn btn-lg btn-success btn-block"));
	  System.out.println(submitElement.getTagName());  
	  System.out.println(submitElement.getAttribute("class")); 
	  System.out.println(submitElement.getAttribute("placeholder")); 
	  System.out.println(submitElement.getAttribute("value"));
  }
}
