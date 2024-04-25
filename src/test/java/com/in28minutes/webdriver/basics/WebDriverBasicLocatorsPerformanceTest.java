package com.in28minutes.webdriver.basics;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBasicLocatorsPerformanceTest extends AbstractWebDriverTest {

	
  @Test
  public void testCssSelectorForMultipleTableTd() {
	  
	  driver.get("http://localhost:8080/pages/tables.html");
	  
	  
	  
	  WebElement tablRow1Element =  driver.findElement(By.cssSelector("#dataTables-example > tbody > tr:nth-child(1) > td:nth-child(2)"));
	  WebElement tablRow2Element =  driver.findElement(By.cssSelector("#dataTables-example > tbody > tr:nth-child(2) > td:nth-child(2)"));
	  WebElement tablRow3Element =  driver.findElement(By.cssSelector("#dataTables-example > tbody > tr:nth-child(3) > td:nth-child(2)"));
	  System.out.println(tablRow1Element.getText());
	  
	  assertEquals("Firefox 1.0", tablRow1Element.getText());
	
  }
  
  @Test
  public void testCssSelectorForMultipleTableTdBetter() {
	  
	  driver.get("http://localhost:8080/pages/tables.html");
	  
	  
	  
	  WebElement tablBodyElement =  driver.findElement(By.cssSelector("#dataTables-example > tbody"));
	 
	  WebElement tablRow1Element =  tablBodyElement.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(2)"));
			  
			 
	  WebElement tablRow3Element =  tablBodyElement.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(2)"));
	  System.out.println(tablRow1Element.getText());
	  System.out.println(tablRow3Element.getText()); 

	
  }
  
  }

