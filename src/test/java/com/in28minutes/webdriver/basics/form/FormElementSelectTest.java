package com.in28minutes.webdriver.basics.form;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractWebDriverTest;

public class FormElementSelectTest extends AbstractWebDriverTest {
  
	@Test
  public void readFromSelectBoxTest() {
	  
	  driver.get("http://localhost:8080/pages/forms.html");
	  
	  WebElement selectBoxElement = driver.findElement(By.id("selectElement1"));
	  
	   Select select = new Select(selectBoxElement);
	   System.out.println("is it Multiple selector: " + select.isMultiple());
	   System.out.println(select.getFirstSelectedOption().getText());
	   	   	
//	  String expectedTextString = "in28minutes";
//	  
//	  assertEquals(expectedTextString, textInputElement.getAttribute("value"));
  }
	
	@Test
	  public void readFromMultipleSelectBoxTest() {
		  
		  driver.get("http://localhost:8080/pages/forms.html");
		  
		  WebElement selectBoxElement = driver.findElement(By.id("multiSelectElement"));
		  
		   Select select = new Select(selectBoxElement);
		   System.out.println("is it Multiple selector: " + select.isMultiple());
		   
		   List<WebElement> selectedOptions = select.getAllSelectedOptions();
				   
			for(WebElement selectedOption:selectedOptions) {	   
		   System.out.println(selectedOption.getText());
			}
		   	   	
//		  String expectedTextString = "in28minutes";
//		  
//		  assertEquals(expectedTextString, textInputElement.getAttribute("value"));
	  }
	
	@Test
	  public void setValueForeSelectBoxTest() {
		  
		  driver.get("http://localhost:8080/pages/forms.html");
		  
		  WebElement selectBoxElement = driver.findElement(By.id("selectElement1"));
		  
		   Select select = new Select(selectBoxElement);
//		   System.out.println("is it Multiple selector: " + select.isMultiple());
//		   System.out.println(select.getFirstSelectedOption().getText());
		   sleep(4);
		   select.selectByValue("2");
		   sleep(4);
		   select.selectByVisibleText("Five");
		   sleep(4);
		   select.selectByIndex(3);
		   sleep(4);
		   
		   System.out.println("is it Multiple selector: " + select.isMultiple());
		   System.out.println(select.getFirstSelectedOption().getText());
//		   List<WebElement> selectedOptions = select.getAllSelectedOptions();
//				   
//			for(WebElement selectedOption:selectedOptions) {	   
//		   System.out.println(selectedOption.getText());
//			}
		   	   	
//		  String expectedTextString = "in28minutes";
//		  
//		  assertEquals(expectedTextString, textInputElement.getAttribute("value"));
	  }
	
	@Test
	  public void setValueForMultipleSelectBoxTest() {
		  
		  driver.get("http://localhost:8080/pages/forms.html");
		  
		  WebElement selectBoxElement = driver.findElement(By.id("multiSelectElement"));
		  
		   Select select = new Select(selectBoxElement);
//		   System.out.println("is it Multiple selector: " + select.isMultiple());
//		   System.out.println(select.getFirstSelectedOption().getText());
		   sleep(4);
		   select.selectByValue("2");
		   sleep(4);
		   select.selectByVisibleText("Five");
		   sleep(4);
		   select.selectByIndex(3);
		   sleep(4);
		   select.deselectByVisibleText("Three");
		   
		   System.out.println("is it Multiple selector: " + select.isMultiple());
		   System.out.println("the first selected option is " + select.getFirstSelectedOption().getText());
		  
		   List<WebElement> selectedOptions = select.getAllSelectedOptions();
				   
			for(WebElement selectedOption:selectedOptions) {	   
		   System.out.println(selectedOption.getText());
			}
		   	   	
//		  String expectedTextString = "in28minutes";
//		  
//		  assertEquals(expectedTextString, textInputElement.getAttribute("value"));
	  }
	
}
