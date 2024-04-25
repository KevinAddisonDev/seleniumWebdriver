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

public class WebDriverBasicLocatorsWithXPathSelectorTest extends AbstractWebDriverTest {

	
  @Test
  public void testXpathSelectorForTableRow1() {
	  
	  driver.get("http://localhost:8080/pages/tables.html");
	  WebElement tablRow1Element =  driver.findElement(By.xpath("//*[@id=\'dataTables-example\']/tbody/tr[1]/td[2]"));
	  System.out.println(tablRow1Element.getText());
	  
	  assertEquals("Firefox 1.0", tablRow1Element.getText());
	
  }
  
  @Test
  
  public void testSortedBrowserRow1Xpath() {
	  
	  driver.get("http://localhost:8080/pages/tables.html");
	  WebElement tableBrowserColumnElement = driver.findElement(By.xpath("//*[@id=\'dataTables-example\']/thead/tr/th[2]"));
	  tableBrowserColumnElement.click();
	  WebElement tableBrowserColumnRow1 = driver.findElement(By.xpath("//*[@id='dataTables-example']/tbody/tr[1]/td[2]"));
	  assertEquals("All others",tableBrowserColumnRow1.getText());
	  
	  //#dataTables-example > tbody > tr:nth-child(1) > td:nth-child(2)
	  
	 }
  }

