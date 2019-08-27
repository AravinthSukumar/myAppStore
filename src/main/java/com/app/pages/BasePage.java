package com.app.pages;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class BasePage {

		public static WebDriver driver;
		public String browser = "chrome";

		public BasePage() {
			if (driver == null) {
				if (browser.equals("chrome")) {
					System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium\\Selenium\\chromedriver\\chromedriver.exe");
					driver = new ChromeDriver();
				} 
				else 
				{
					System.out.println("chrome browser not found");
					}
				
					/*if (browser.equals("firefox")) {
					System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Selenium\\Selenium\\chromedriver\\chromedriver.exe");
					driver = new FirefoxDriver();
				}*/
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				driver.get("http://automationpractice.com/index.php");
			}
		}
		public String homename() {
			return driver.getTitle();
		}

}
