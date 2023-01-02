package com.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class TagExpostepdefinition 
{
	public static WebDriver driver;
	
	@Given("^user able to launch the browser$")
	public void user_able_to_launch_the_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Dinesh K\\eclipse-workspace\\TagExpo\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
		
	}

	@When("^user able enter the url$")
	public void user_able_enter_the_url() throws Throwable {
		driver.get("http://texvalley.1clxlite.com/");
		driver.manage().window().maximize();
		
	}




}
