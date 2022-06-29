package Tests;

import org.junit.jupiter.api.Test;

import Pages.HomePage;

public class Logout extends TestParameters {

	@Test
	public void PositiveLogout() throws Exception {
		driver.navigate().to("http://localhost:8080/skaiciuotuvas");
		HomePage hp = new HomePage(driver);
		hp.SignInData("labaskrabas", "stiprusslaptazodis");
		hp.SubmitPrisijungti();
		hp.LogOut();
		hp.CatchAlertsLogOut();
		Thread.sleep(3000);

	}

}
