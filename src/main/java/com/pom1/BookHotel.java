package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookHotel {
	
	public static WebDriver driver;
	
	@FindBy(id = "first_name")
	public static WebElement firstname;
	
	@FindBy(name = "last_name")
	public static WebElement lastname;
	
	@FindBy(id = "address")
	public static WebElement address;
	
	@FindBy(id = "cc_num")
	public static WebElement ccnum;
	
	@FindBy(id = "cc_type")
	public static WebElement cctype;
	
	@FindBy(name = "cc_exp_month")
	public static WebElement ccexpmonth;
	
	@FindBy(name = "cc_exp_year")
	public static WebElement ccexpyear;
	
	@FindBy(name = "cc_cvv")
	public static WebElement cvv;
	
	@FindBy(name = "book_now")
	public static WebElement booknow;
	
	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	public static WebElement booked_itinerary;
	
	
	
	
	
	
	
	
	
	
	

}
