package com.pom;

import org.openqa.selenium.WebDriver;

import com.Baseclass.Baseclass;
import com.Baseclass.Home_page;
import com.Baseclass.Signin_page;

public class Testrunner extends Baseclass {
	public static WebDriver driver = Baseclass.getBrowser("chrome") ;
	public static Home_page hp = new Home_page(driver);
	public static Signin_page sp = new Signin_page(driver);

	public static void main(String[] args) {
			driver = getUrl("http://automationpractice.com/index.php");
		clickonElement(hp.getSignIn());
		inputValueElement(sp.getEmail(), "lakshmity@gmail.com");
		inputValueElement(sp.getPassword(), "lakshmity123");
		clickonElement(sp.getSignInButton());
		driver = close();
		driver = quit();

	}

}
		