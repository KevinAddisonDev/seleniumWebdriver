package com.in28minutes.webdriver.basics;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebDriverBasicsLocatorsWithLinkTextTest extends AbstractWebDriverTest {
  
	
 @Test
  public void getIn28minutesLinkAndClick() {
	 
	 driver.get("http://localhost:8080/login");
	WebElement linkElement = driver.findElement(By.linkText("in28Minutes"));
	System.out.println(linkElement.getAttribute("href"));
	linkElement.click();
	System.out.println(driver.getCurrentUrl());
	 
  }
 @Test
 public void getStaticIndexHtmlPagesLink() {
	 
	 driver.get("http://localhost:8080/pages/index.html");
WebElement tableLinkElement = driver.findElement(By.linkText("Tables"));
System.out.println(tableLinkElement.getAttribute("href"));


	 
 }
 
 @Test
 public void getStaticIndexHtmlPagesSBAdminLink() {
	 
	 driver.get("http://localhost:8080/pages/index.html");
WebElement tableLinkElement = driver.findElement(By.partialLinkText("SB Admin"));
System.out.println(tableLinkElement.getAttribute("href"));


	 
 }
 
}
