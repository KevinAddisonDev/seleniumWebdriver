package com.in28minutes.webdriver.basics;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebDriverBasicsLocatorsWithTagTest extends AbstractWebDriverTest {
  
	
 @Test
  public void getDetailsAboutLoginButton() {
	 
	 driver.get("http://localhost:8080/pages/login.html");
	 WebElement loginButtonLinkElement = driver.findElement(By.tagName("a"));
	 
	 System.out.println(loginButtonLinkElement.getText());
	 System.out.println(loginButtonLinkElement.getAttribute("class"));
	 System.out.println(loginButtonLinkElement.getAttribute("href"));
	 
  }
 @Test
 public void getDetailsAboutInputTags() {
	 
	 driver.get("http://localhost:8080/pages/login.html");
	 WebElement inpuElement = driver.findElement(By.tagName("input"));
	 //find element will return the first element matching the search criteria
	 System.out.println(inpuElement.getText());
	 System.out.println(inpuElement.getAttribute("class"));
	 System.out.println(inpuElement.getAttribute("href"));//ATTRIBUTE NOT PRESENT SO RETURNS NULL
	 System.out.println(inpuElement.getAttribute("name"));
	 System.out.println(inpuElement.getAttribute("placeholder"));
	 
 }
 
 @Test
 public void getDetailsAboutAllElements() {
	 
	 driver.get("http://localhost:8080/pages/login.html");
	 List<WebElement> inpuElements = driver.findElements(By.tagName("input"));
	 
	 for(WebElement inputElement:inpuElements) {
		 System.out.println(inputElement.getText());
		 System.out.println(inputElement.getAttribute("class"));
		 System.out.println(inputElement.getAttribute("href"));//ATTRIBUTE NOT PRESENT SO RETURNS NULL
		 System.out.println(inputElement.getAttribute("name"));
		 System.out.println(inputElement.getAttribute("placeholder"));		 
	 }
 }
	 
	 @Test
	 public void getDetailsAboutLoginFormElements() {
		 
		 driver.get("http://localhost:8080/login");
		 List<WebElement> inpuElements = driver.findElements(By.tagName("input"));
		 //the page above has no classes or placeholders
		 for(WebElement inputElement:inpuElements) {
			 System.out.println(inputElement.getText());
			 System.out.println(inputElement.getAttribute("type"));
			 System.out.println(inputElement.getAttribute("name"));
			 sleep(3);
		 }
	
	 
 }
}
