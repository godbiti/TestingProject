package Tests;

import org.junit.jupiter.api.Test;

import Pages.HomePage;

public class Login extends TestParameters {

	@Test
	public void PositiveLogin() throws Exception {
		driver.navigate().to("http://localhost:8080/prisijungti");
		HomePage hp = new HomePage(driver);
		hp.SignInData("labaskrabas", "stiprusslaptazodis");
		hp.SubmitPrisijungti();
		Thread.sleep(3000);
		System.out.println("Sign in successful.");
		Thread.sleep(3000);
		hp.LogOut();
	}

	@Test
	public void NegativeLogin() throws Exception {
		driver.navigate().to("http://localhost:8080/prisijungti");
		HomePage hp = new HomePage(driver);
		hp.SignInData("", "stiprusslaptazodis");
		hp.SubmitPrisijungti();
		hp.CatchAlertsLogin();

	}
}
