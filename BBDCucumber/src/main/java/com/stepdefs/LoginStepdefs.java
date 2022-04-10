package com.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepdefs {
	
	WebDriver driver;
	
	// Cucumber annotation----hooks in cucumber
	@Before
	public void setup(){  //this run before every scenario
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
	}
	@After
	public void tearDown(){  //this will run after every scenario
		driver.close();
	}
	
	
	@Given("^user should be on login page$")
	public void user_should_be_on_login_page() throws Throwable {
		driver.get("file:///A:/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	}

	//@When("^user enter valid credentials$")
	//public void user_enter_valid_credentials() throws Throwable {
	
	@When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String uname, String pass) throws Throwable{
		driver.findElement(By.id("email")).sendKeys(uname);
	driver.findElement(By.id("password")).sendKeys(pass);
	driver.findElement(By.xpath("//button")).click();  
	}

	@Then("^user should be on home page$")
	public void user_should_be_on_home_page() throws Throwable {
		 System.out.println("Login Test..");
		    Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
}
	@Then("^user should see JBK logo$")
	public void user_should_see_JBK_logo() throws Throwable {
	 WebElement logo=driver.findElement(By.tagName("img"));
	 Assert.assertTrue(logo.isDisplayed());
	 System.out.println("logo test");
	
}
}

