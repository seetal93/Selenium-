package com.qa.Selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {
		
		
		@FindBy(id= "sb_form_q")
		private WebElement searchBox;
		
		public void searchBing(String searchText) {
			searchBox.sendKeys(searchText);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			searchBox.click();
			searchBox.submit();
			
		}
}
