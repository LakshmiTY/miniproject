package com.Baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	public static WebDriver driver;

	@FindBy(xpath = "//a[@class='login']") // xpath(signin) for homepage in automation practice
	private WebElement signIn;

	public Home_page(WebDriver abc) { // here abc reference name as our wish

		this.driver = abc;
		PageFactory.initElements(driver, this); // here this can be used to represent all the webelements in this page
	}

	public WebElement getSignIn() {
		return signIn;
	}

}
