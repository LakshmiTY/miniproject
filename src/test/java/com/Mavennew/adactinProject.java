package com.Mavennew;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class adactinProject {
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91778\\eclipse-workspace\\Mavennew\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://adactinhotelapp.com/index.php");

		// login
		driver.findElement(By.id("username")).sendKeys("TYLakshmi");
		driver.findElement(By.id("password")).sendKeys("9985366885");
		driver.findElement(By.name("login")).click();

		// Search Hotel

		WebElement location = driver.findElement(By.name("location"));
		Select sc = new Select(location);
		sc.selectByValue("Sydney");

		WebElement hotel = driver.findElement(By.name("hotels"));
		Select sc1 = new Select(hotel);
		sc1.selectByValue("Hotel Sunshine");

		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select sc2 = new Select(roomtype);
		sc2.selectByIndex(4);

		WebElement roomno = driver.findElement(By.name("room_nos"));
		Select sc3 = new Select(roomno);
		sc3.selectByValue("4");

		WebElement checkin = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		checkin.clear();
		checkin.sendKeys("25/06/2022");

		WebElement checkout = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		checkout.clear();
		checkout.sendKeys("29/06/2022");

		WebElement adult = driver.findElement(By.id("adult_room"));
		Select sc4 = new Select(adult);
		sc4.selectByVisibleText("3 - Three");

		WebElement child = driver.findElement(By.id("adult_room"));
		Select sc5 = new Select(child);
		sc5.selectByVisibleText("2 - Two");

		WebElement search = driver.findElement(By.id("Submit"));
		search.click();

		// Select hotel
		WebElement select = driver.findElement(By.id("radiobutton_0"));
		select.click();

		WebElement contin = driver.findElement(By.id("continue"));
		contin.click();

		// Book hotel
		driver.findElement(By.id("first_name")).sendKeys("Lakshmi");
		driver.findElement(By.name("last_name")).sendKeys("TY");
		driver.findElement(By.id("address")).sendKeys("Gudur");
		driver.findElement(By.id("cc_num")).sendKeys("1234567891011159");

		WebElement cardtype = driver.findElement(By.id("cc_type"));
		Select sc6 = new Select(cardtype);
		sc6.selectByValue("VISA");

		WebElement exprymonth = driver.findElement(By.name("cc_exp_month"));
		Select sc7 = new Select(exprymonth);
		sc7.selectByVisibleText("September");

		WebElement expryyear = driver.findElement(By.name("cc_exp_year"));
		Select sc8 = new Select(expryyear);
		sc8.selectByVisibleText("2019");

		WebElement cvv = driver.findElement(By.name("cc_cvv"));
		cvv.sendKeys("123");

		driver.findElement(By.name("book_now")).click();

		         //Booked itinerary

		driver.findElement(By.xpath("//a[text()='Booked Itinerary']")).click();
		
		         // Screenshot @booked itinerary
		TakesScreenshot ts=(TakesScreenshot)driver;
		File ScreenshotAS=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\91778\\eclipse-workspace\\Mavennew\\Screenshot/booked itinerary.png");
		FileUtils.copyFile(ScreenshotAS, destination);
		         
		        // logout
		driver.findElement(By.id("logout")).click();
		
		    // Screenshot for logout
		TakesScreenshot ts1=(TakesScreenshot)driver;
		File ScreenshotAS1=ts1.getScreenshotAs(OutputType.FILE);
		File destination1=new File("C:\\Users\\91778\\eclipse-workspace\\Mavennew\\Screenshot/logout.png");
		FileUtils.copyFile(ScreenshotAS1, destination1);
		         
		
		System.out.println("Booked");

	
	}
}
