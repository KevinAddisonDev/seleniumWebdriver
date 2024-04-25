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

public class WebDriverBasicLocatorsWithClassTest extends AbstractWebDriverTest {

	
  @Test
  public void testTitle() {
	  
	  driver.get("http://localhost:8080/pages/index.html");
	  WebElement sbAdmineElement =  driver.findElement(By.className("navbar-brand"));
	  System.out.println(sbAdmineElement.getAttribute("href"));
	  
	  assertEquals("SB Admin v2.0", sbAdmineElement.getText());
	
  }
  
  @Test
  
  public void testHugeElements() {
	  
	  driver.get("http://localhost:8080/pages/index.html");
	  
	 List<WebElement> hugElements = driver.findElements(By.className("huge"));
	 
	 for(WebElement hugElement:hugElements) {
		 
		 System.out.println(hugElement.getText());
		 
		
	 }
  }

}
