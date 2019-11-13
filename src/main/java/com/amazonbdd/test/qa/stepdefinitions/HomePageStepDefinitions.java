package com.amazonbdd.test.qa.stepdefinitions;



import com.amazonbdd.test.qa.helper.WaitHelper;
import com.amazonbdd.test.qa.pageObjects.HomePage;
import com.amazonbdd.test.qa.testBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDefinitions extends TestBase{

	HomePage homePage = new HomePage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	

}
