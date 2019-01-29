package com.qa.Selenium;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BingTesting {
	
		
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
		
		//@Ignore
		//@Test
		//public void bingSearch() throws InterruptedException {
			//driver.get(Constant.URL2);
			//LandingPage bingLandingPage = PageFactory.initElements(driver, LandingPage.class);
			//bingLandingPage.searchBing("selenium");
			//Thread.sleep(1000);
			//BingSearchPage bingSearchPage = PageFactory.initElements(driver, BingSearchPage.class);
			//assertEquals("not found", "Selenium", bingSearchPage.getSearch());
		//} 
		
//		@Test
//		public void draw() throws InterruptedException {
//			driver.manage().window().maximize();
//			driver.get(Constant.URL2);
//			WebElement painter = driver.findElement(By.id("painter"));
//			Actions action = new Actions(driver);
//			action.moveToElement(painter).clickAndHold().moveByOffset(-50, 0).moveByOffset(0, -50).moveByOffset(50,0).moveByOffset(-50, 0).moveByOffset(0,-50).moveByOffset(50,0).perform(); 
//			action.release().moveByOffset(100,0).perform();
//			action.clickAndHold().moveByOffset(-50, 0).moveByOffset(0, -50).moveByOffset(50,0).moveByOffset(-50, 0).moveByOffset(0,-50).moveByOffset(50,0).perform();
//			action.release().perform();
//			Thread.sleep(4000);
//		}
		
//		@Test
//		public void implit() throws InterruptedException {
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			driver.get(Constant.URL3);
//			WebElement myDynamicElement = driver.findElement(By.xpath("//*[@id=\"quote\"]/h2")); 
//			Thread.sleep(100);
//			assertEquals("non", "-The Shafeeq", myDynamicElement.getText());
//		}
		
		@Test
		public void explit() throws InterruptedException {
			driver.manage().window().maximize();
			driver.get(Constant.URL3); 
			WebElement myDynamicElement = (new WebDriverWait(driver, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"quote\"]/h2"))); 
			assertEquals("non", "-The Shafeeq", myDynamicElement.getText());
			}
		
}
