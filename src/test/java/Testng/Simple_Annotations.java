package Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {

	@BeforeSuite
	private void set_property() {
		System.out.println("set property");

	}

	@BeforeTest
	private void browser_launch() {
		System.out.println("Browser launch");

	}

	@BeforeClass
	private void url_launch() {
		System.out.println("url_launch");
	}

	@BeforeMethod
	private void Sign_in() {
		System.out.println("Sign_in");
	}

	@Test
	private void women() {
		System.out.println("Women");
	}

	@Test
	private void tshirts() {
		System.out.println("tshirts");

	}

	@Test
	private void Dresses() {
		System.out.println("Dresses");
	}

	@AfterMethod
	private void sign_off() {
		System.out.println("signoff");
	}

	@AfterClass
	private void home_page() {
		System.out.println("home page");
	}

	@AfterTest
	private void close() {
		System.out.println("close");
	}

	@AfterSuite
	private void delete_all_cookies() {
		System.out.println("delete All Cookies");

	}

}
