package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	
	public static WebDriver driver;
	
	@FindBy(name="location")
	public static WebElement loc;
	
	@FindBy(name="hotels")
	public static WebElement hotel;
	
	@FindBy(id="room_type")
	public static WebElement roomtype;
	
	@FindBy(name="room_nos")
	public static WebElement roomnos;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	public static WebElement checkin;
	
	@FindBy(name="(//input[@type='text'])[3]")
	public static WebElement checkout;
	
	@FindBy(id="adult_room")
	public static WebElement adultroom;
	
	@FindBy(id="child_room")
	public static WebElement childroom;
	
	@FindBy(id="Submit")
	public static WebElement submit;

	public static WebDriver getDriver() {
		return driver;
	}

	public static WebElement getLoc() {
		return loc;
	}

	public static WebElement getHotel() {
		return hotel;
	}

	public static WebElement getRoomtype() {
		return roomtype;
	}

	public static WebElement getRoomnos() {
		return roomnos;
	}

	public static WebElement getCheckin() {
		return checkin;
	}

	public static WebElement getCheckout() {
		return checkout;
	}

	public static WebElement getAdultroom() {
		return adultroom;
	}

	public static WebElement getChildroom() {
		return childroom;
	}

	public static WebElement getSubmit() {
		return submit;
	}
	
	public SearchHotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}
	
	
	

}
