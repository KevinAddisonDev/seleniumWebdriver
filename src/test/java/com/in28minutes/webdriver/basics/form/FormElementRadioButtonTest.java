package com.in28minutes.webdriver.basics.form;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.google.common.escape.Escaper;
import com.in28minutes.webdriver.basics.AbstractWebDriverTest;

public class FormElementRadioButtonTest extends AbstractWebDriverTest {
  
	@Test
  public void readFromRadioButtonElementTest() {
	  
	  driver.get("http://localhost:8080/pages/forms.html");
	  readSelectedRadioButtonsValue("optionsRadios");
  }
	
	
	private String readSelectedRadioButtonsValue(String name) {
		List<WebElement> radiobuttonElements = driver.findElements(By.name(name));
		  
		  
		  for(WebElement radiobuttonElement:radiobuttonElements) {
			  
			  System.out.println(radiobuttonElement.getAttribute("value") + " " + radiobuttonElement.isSelected());
			  
			  if(radiobuttonElement.isSelected()) {
				  
				  return radiobuttonElement.getAttribute("value");
			  }
		  }
		  return null;
	}
	
	
	@Test
	  public void getSelectedRadioButtonTest() {
		  
		  driver.get("http://localhost:8080/pages/forms.html");
		  System.out.println(readSelectedRadioButtonsValue("optionsRadios"));
		  
	  }
	
	@Test
	  public void setValueOnRadioButtonElementTest() {
		  
		  driver.get("http://localhost:8080/pages/forms.html");
		  List<WebElement> radiobuttonElements = driver.findElements(By.name("optionsRadios"));
		  sleep(2);
		  for(WebElement radiobuttonElement:radiobuttonElements) {
			  if(radiobuttonElement.getAttribute("value").equals("option2")) {
				  radiobuttonElement.click();
			  }  
		  }
		  sleep(4);
	  }
	@Test
	  public void setUnCheckedValueIntoCheckBoxElementTest() {
		  
		  driver.get("http://localhost:8080/pages/forms.html");
		  
		  	uncheckACheckbox("checkboxElement1");
		  	sleep(2);
		  	uncheckACheckbox("checkboxElement2");
		  	sleep(2);
		  	uncheckACheckbox("checkboxElement3");
		  	sleep(2);

	  }
	
	private WebElement checkACheckbox(String checkboxName) {
		WebElement textCheckbox1Element = driver.findElement(By.name(checkboxName));
		  	
		  Boolean currentValue = textCheckbox1Element.isSelected();
		  if(currentValue==false) {
			textCheckbox1Element.click();  	  
		  }
		return textCheckbox1Element;
	}
	
	private WebElement uncheckACheckbox(String checkboxName) {
		WebElement textCheckbox1Element = driver.findElement(By.name(checkboxName));
		  	
		  Boolean currentValue = textCheckbox1Element.isSelected();
		  if(currentValue==true) {
			textCheckbox1Element.click();  	  
		  }
		return textCheckbox1Element;
	}

	  }
