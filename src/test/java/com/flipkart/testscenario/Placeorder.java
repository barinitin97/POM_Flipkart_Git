package com.flipkart.testscenario;

import org.testng.annotations.Test;

import com.flipkart.pages.LoginPage;
import com.flipkart.pages.SearchProductPage;
import com.flpikart.base.TestBase;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Placeorder extends TestBase {
	@BeforeClass
	public void setUp() {
		launchBrowser();
		navigateToURL();
	}

	@AfterClass
	public void tearDown() {
	}
	
	@Test
	public void loginTest() {
		LoginPage loginPage = new LoginPage();
		boolean actResult = loginPage.validateLogin("9094018902", "Asdf@123");
		Assert.assertTrue(actResult);
	}

	
	@Test
	public void seachProductTest() {
		SearchProductPage SearchProductPage = new SearchProductPage();
		SearchProductPage.validateSearchProduct("laptop");
	}
	
	@Test
	public void selectProductTest() {
	}
	
	@Test
	public void addToCartTest() {
	}
	
	@Test
	public void placeOrderTest() {
	}
	
	@Test
	public void makePayment() {
	}
	
	@Test
	public void logoutTest() {
	}

}
