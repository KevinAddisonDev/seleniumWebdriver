package com.in28minutes.webdriver.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractWebDriverTest;

public class FirstWebApplicationLoginTest extends AbstractWebDriverTest {
  @Test
  public void loginTest() {
	  driver.get("http://localhost:8080/login");
	  
	  WebElement nameElement = driver.findElement(By.name("name"));
	  nameElement.sendKeys("in28minutes");
	  sleep(1);
	  WebElement passElement = driver.findElement(By.id("password"));
	  passElement.sendKeys("dummy");
	  sleep(1);
	  WebElement submElement = driver.findElement(By.id("submit"));
	  submElement.click();
	  sleep(1);
	  WebElement welcomeMessagElement =  driver.findElement(By.id("welcome-message"));
	  
	  System.out.println(welcomeMessagElement.getText());
	  
  }

}
