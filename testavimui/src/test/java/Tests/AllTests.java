package Tests;

import org.junit.jupiter.api.Test;

import Pages.HomePage;

public class AllTests extends TestParameters {

	@Test
	public void PositiveLogout() throws Exception {
		driver.navigate().to("http://localhost:8080/skaiciuotuvas");

		HomePage hp = new HomePage(driver);

		hp.SignUp();
		hp.SignUpData("labaskrabas", "stiprusslaptazodis", "stiprusslaptazodis");
		hp.SubmittApplication();
		System.out.println("Sign up successful.");
		Thread.sleep(3000);
		hp.LogOut();
		hp.CatchAlertsLogOut();
		Thread.sleep(3000);

		driver.navigate().to("http://localhost:8080/prisijungti");
		hp.SignUp();
		hp.SignUpData("labaskrabas", "stiprusslaptazodis", "stiprusslaptazodis");
		hp.SubmittApplication();
		hp.CatchAlerts();
		Thread.sleep(3000);

		driver.navigate().to("http://localhost:8080/prisijungti");

		hp.SignInData("labaskrabas", "stiprusslaptazodis");

		hp.SubmitPrisijungti();
		System.out.println("Sign up successful.");
		Thread.sleep(3000);
		hp.LogOut();
		hp.CatchAlertsLogOut();
		Thread.sleep(3000);

		driver.navigate().to("http://localhost:8080/prisijungti");

		hp.SignInData("", "stiprusslaptazodis");

		hp.SubmitPrisijungti();
		hp.CatchAlertsLogin();

	}

}
