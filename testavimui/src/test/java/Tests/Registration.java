package Tests;

import org.junit.jupiter.api.Test;

import Pages.HomePage;

public class Registration extends TestParameters {

	@Test
	public void PositiveRegistration() throws Exception {

		driver.navigate().to("http://localhost:8080/prisijungti");
		HomePage hp = new HomePage(driver);
		hp.SignUp();
		hp.SignUpData("labaskrabas", "stiprusslaptazodis", "stiprusslaptazodis");
		hp.SubmittApplication();
		System.out.println("Sign up successful.");
		Thread.sleep(3000);
	}

	@Test
	public void NegativeRegistration() throws Exception {
		driver.navigate().to("http://localhost:8080/prisijungti");

		HomePage hp = new HomePage(driver);
		hp.SignUp();
		hp.SignUpData("labaskrabas", "stiprusslaptazodis", "stiprusslaptazodis");
		hp.SubmittApplication();
		hp.CatchAlerts();
		Thread.sleep(3000);
	}
}
