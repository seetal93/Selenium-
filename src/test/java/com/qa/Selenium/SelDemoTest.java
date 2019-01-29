package com.qa.Selenium;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelDemoTest {
	
	WebDriver driver;
	
	@Before
	public void setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
	driver = new ChromeDriver();
	}
	
	@After
	public void teardown() {
		driver.quit();
	}
	
	
	@Test 
	public void testy() throws InterruptedException {
		driver.manage().window().maximize();
		WebElement textbox = driver.findElement(By.name("q"));
		textbox.sendKeys("Selenium");
		textbox.submit();
		WebElement sele = driver.findElement(By.xpath("//*[@id=\\\"b_content\\\"]/li[1]/div/div[1]/h2"));
		Thread.sleep(3000);
		assertEquals("Selenium test not found", "Selenium", sele.getText());
		
	}
}
