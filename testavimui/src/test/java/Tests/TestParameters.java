package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestParameters {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "\\drivers\\chromedriver.exe");
	}

	protected static WebDriver driver;

	@BeforeTest
	public void SetUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@AfterTest
	public void TearDown() {
		driver.manage().deleteAllCookies();
		driver.close();
	}

}
