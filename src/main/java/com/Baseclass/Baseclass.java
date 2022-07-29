package com.Baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass {

	public static WebDriver driver;

	public static WebDriver getBrowser(String type) {

		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
					+ "C:\\Users\\91778\\eclipse-workspace\\Mavennew\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();

		}
		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("Webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");

			driver = new FirefoxDriver();

		}
		driver.manage().window().maximize();
		return driver;

	}

	// Web driver Methods

	public static WebDriver getUrl(String Url) {
		driver.get(Url);
		return driver;

	}

	public static void getTitle(String Title) {
		System.out.println(driver.getTitle());

	}

	public static void clickonElement(WebElement element) {

		element.click();

	}

	public static void inputValueElement(WebElement element, String value) {
		element.sendKeys(value);

	}

	public static WebDriver close() {
		driver.close();
		return driver;

	}

	public static WebDriver quit() {
		driver.quit();
		return driver;

	}

	// Navigation Methods
	public static void navigateTo(String url) {
		driver.navigate().to(url);

	}

	public static void back() {
		driver.navigate().back();

	}

	public static void forward() {
		driver.navigate().forward();

	}

	public static void refresh() {
		driver.navigate().refresh();

	}

}
