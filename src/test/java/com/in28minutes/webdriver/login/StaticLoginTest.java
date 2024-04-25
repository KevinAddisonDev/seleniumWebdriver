package com.in28minutes.webdriver.login;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractWebDriverTest;

public class StaticLoginTest extends AbstractWebDriverTest {

  
  @Test
  public void loginStatichtmlTest() {
	  driver.get("http://localhost:8080/pages/login.html");
	  
	  WebElement namElement = driver.findElement(By.name("email"));
	  namElement.sendKeys("in28minutes");
	  sleep(1);
	  WebElement passwordElement = driver.findElement(By.name("password"));
	  passwordElement.sendKeys("dummy");
	  sleep(1);
	  WebElement submElement = driver.findElement(By.tagName("a"));
	  submElement.click();
	  sleep(1);
	   
	  System.out.println(driver.getTitle());
	  String actualUrl =  driver.getCurrentUrl();
	  String expectedUrlString = "http://localhost:8080/pages/index.html";
	  assertEquals(actualUrl, expectedUrlString);
  }
}
