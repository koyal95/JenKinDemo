package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginTest {
	@Test
	public void TestFireFox() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\thora\\Desktop\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		driver.quit();
	}

}
