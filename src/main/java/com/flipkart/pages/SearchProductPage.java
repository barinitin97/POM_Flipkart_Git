package com.flipkart.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flpikart.base.TestBase;

public class SearchProductPage extends TestBase {
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
By searchLoc = By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input");
By searchbtn = By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button/svg");
	
	public void validateSearchProduct(String productName) {
		driver.findElement(searchLoc).sendKeys(productName);
		wait(2000);
		driver.findElement(searchLoc).sendKeys(Keys.ENTER);
		
		boolean flagResult = true;
		
		try {
		wait.until(ExceptedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[1]/div/div/div[1]/div[3]/a")));}
		catch (TimeoutException te) {
			captureScreenshot("Search Product Failure");
			flagResult = false;
		
	}
		if (flagResult) {
        	String actResult = driver.findElement(By.xpath("//*[text()='compare']")).getText();
        	boolean actResult1.equals("Laptops");
        }else
        	return false;

}
}