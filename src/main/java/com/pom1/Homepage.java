package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	public static WebDriver driver;

	@FindBy(id = "username")
	private WebElement user;

	@FindBy(id = "password")
	private WebElement pass;

	@FindBy(name = "login")
	private WebElement login;

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getUser() {
		return user;
	}

	public Homepage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}

}
