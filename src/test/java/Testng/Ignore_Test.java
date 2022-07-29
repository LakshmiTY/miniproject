package Testng;

import org.testng.annotations.Ignore;

public class Ignore_Test {
	
	private void women() {
System.out.println("women");
	}
	
	private void men() {
System.out.println("men");
	}
	
	@Ignore
	private void dresses() {
System.out.println("Dresses");
	}

}
