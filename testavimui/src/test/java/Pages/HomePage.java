package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPage {

	By CreateAccount = By.xpath("/html/body/div/form/div/h4/a");
	By InputUserName = By.id("username");
	By InputPassword = By.id("password");
	By InputPasswordConfirm = By.id("passwordConfirm");
	By CreateClick = By.xpath("//*[@id=\"userForm\"]/button");
	By TextMessage = By.xpath("//*[@id=\"username.errors\"]");
	By LoginClick = By.xpath("/html/body/div/form/div/button");
	By InputUserName2 = By.xpath("/html/body/div/form/div/input[1]");
	By InputPassword2 = By.xpath("/html/body/div/form/div/input[2]");
	By Logout = By.xpath("/html/body/nav/div/ul[2]/a");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void SignUp() {
		driver.findElement(CreateAccount).click();
	}

	public void SignUpData(String username, String password, String password2) {
		driver.findElement(InputUserName).sendKeys(username);
		driver.findElement(InputPassword).sendKeys(password);
		driver.findElement(InputPasswordConfirm).sendKeys(password2);
	}

	public void SubmittApplication() throws Exception {
		Thread.sleep(3000);
		driver.findElement(CreateClick).click();
		Thread.sleep(3000);
	}

	public void CatchAlerts() throws Exception {

		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//*[@id=\"username.errors\"]")).getText();
		System.out.println(text);

	}

	public void SignInData(String username2, String password2) throws Exception {
		driver.findElement(InputUserName2).sendKeys(username2);
		Thread.sleep(3000);
		driver.findElement(InputPassword2).sendKeys(password2);
		Thread.sleep(3000);

	}

	public void SubmitPrisijungti() throws Exception {
		Thread.sleep(3000);
		driver.findElement(LoginClick).click();
		Thread.sleep(3000);
	}

	public void CatchAlertsLogin() throws Exception {

		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("/html/body/div/form/div/span[2]")).getText();
		System.out.println(text);
	}

	public void LogOut() {
		driver.findElement(Logout).click();
	}

	public void CatchAlertsLogOut() throws Exception {

		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("/html/body/div/form/div/span[1]")).getText();
		System.out.println(text);
	}
}