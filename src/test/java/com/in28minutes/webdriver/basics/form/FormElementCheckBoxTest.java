package com.in28minutes.webdriver.basics.form;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.google.common.escape.Escaper;
import com.in28minutes.webdriver.basics.AbstractWebDriverTest;

public class FormElementCheckBoxTest extends AbstractWebDriverTest {
  
	@Test
  public void readFromCheckBoxElementTest() {
	  
	  driver.get("http://localhost:8080/pages/forms.html");
	  
	  WebElement textCheckbox1Element = driver.findElement(By.name("checkboxElement1"));
	  
	  System.out.println(textCheckbox1Element.isSelected());
	  assertFalse(textCheckbox1Element.isSelected());
	  
	  WebElement textCheckbox2Element = driver.findElement(By.name("checkboxElement2"));

	  System.out.println(textCheckbox2Element.isSelected());
	  assertTrue(textCheckbox2Element.isSelected());

  }
	@Test
	  public void setValueIntoCheckBoxElementTest() {
		  
		  driver.get("http://localhost:8080/pages/forms.html");
		  
		  WebElement textCheckbox1Element = driver.findElement(By.name("checkboxElement1"));
		  	
		  textCheckbox1Element.click();
		  sleep(3);
		  assertTrue(textCheckbox1Element.isSelected());
		  
		  WebElement textCheckbox3Element = driver.findElement(By.name("checkboxElement3"));

		  textCheckbox3Element.click();
		  assertFalse(textCheckbox3Element.isSelected());

	  }
	
	@Test
	  public void setCheckedValueIntoCheckBoxElementTest() {
		  
		  driver.get("http://localhost:8080/pages/forms.html");
		  
		  	checkACheckbox("checkboxElement1");
		  	sleep(2);
		  	checkACheckbox("checkboxElement2");
		  	sleep(2);
		  	checkACheckbox("checkboxElement3");
		  	sleep(2);

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
