package com.in28minutes.webdriver.basics.form;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractWebDriverTest;

public class FormElementTextTest extends AbstractWebDriverTest {
  
	@Test
  public void readFromTextElementTest() {
	  
	  driver.get("http://localhost:8080/pages/forms.html");
	  
	  WebElement textInputElement = driver.findElement(By.id("textElement"));
	  System.out.println(textInputElement.getAttribute("value"));
	  
	  String expectedTextString = "in28minutes";
	  
	  assertEquals(expectedTextString, textInputElement.getAttribute("value"));
  }
	@Test
	  public void setFormTextElementTest() {
		  
		  driver.get("http://localhost:8080/pages/forms.html");
		  
		  WebElement textInputElement = driver.findElement(By.id("textElement"));
		  System.out.println(textInputElement.getAttribute("value"));
		  textInputElement.clear();
		  sleep(2);
		  textInputElement.sendKeys("NewValue");
		  sleep(2);
		  //assertEquals(expectedTextString, textInputElement.getAttribute("value"));
	  }
	
	@Test
	  public void setFormTextAreaElementTest() {
		  
		  driver.get("http://localhost:8080/pages/forms.html");
		  
		  WebElement textInputElement = driver.findElement(By.id("textAreaElement"));
		  sleep(2);
		  textInputElement.sendKeys("This is the text we want to send to the form");
		  textInputElement.sendKeys("\n");
		  textInputElement.sendKeys("second line");
		  sleep(2);
		  String actualValue = textInputElement.getAttribute("value");
		  String expectedValueString = "This is the text we want to send to the form\nsecond line";
		  System.out.println(expectedValueString);
		  assertEquals(actualValue, expectedValueString);
		  
		  //assertEquals(expectedTextString, textInputElement.getAttribute("value"));
	  }
}
