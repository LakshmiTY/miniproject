package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	
	public static WebDriver driver;
   
	@FindBy(id = "radiobutton_0")
	public static WebElement radio;

	@FindBy(id = "continue")
	public static WebElement cont;

	public static WebElement getRadio() {
		return radio;
	}

	public static WebElement getCont() {
		return cont;
	}

	public SelectHotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}

}
