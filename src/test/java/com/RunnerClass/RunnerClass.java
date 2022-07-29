
package com.RunnerClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Baseclass.Baseclass;
import com.Baseclass.Home_page;
import com.Baseclass.Signin_page;

public class RunnerClass extends Baseclass {

	public static WebDriver driver=Baseclass.getBrowser("chrome");

	public static Home_page hp = new Home_page(driver);

	public static Signin_page sp = new Signin_page(driver);

	public static void main(String[] args) {
		
		driver = getUrl("http://automationpractice.com/index.php");
		System.out.println(driver.getTitle());

		clickonElement(hp.getSignIn());

		inputValueElement(sp.getEmail(), "yuvaraj.lakshmi@gmail.com");

		inputValueElement(sp.getPassword(), "lakshmity@123");

		clickonElement(sp.getSignInButton());
		close();
		quit();

	}

}
