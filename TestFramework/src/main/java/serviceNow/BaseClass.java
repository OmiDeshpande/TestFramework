package serviceNow;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;


public class BaseClass{
	Logger logger= Logger.getLogger(BaseClass.class.getName());
	public WebDriver driver;

	private void launchChromeDriver() throws InterruptedException {
		logger.info("********Welcome to Web testing world via CHROME********");
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	private void launchInternetExplorer() {
		logger.info("********Welcome to Web testing world via IE********");
		System.setProperty("webdriver.edge.driver", "src\\test\\resources\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		
	}

	private void launchAppiumDriver() {
		// to do
	}

	private void launchCloudWebDriver() {
		// to do
	}
	
	private void api() {
		logger.info("********Welcome to API testing world********");
		
	}

	public void launchbrowser(String args) {

		try {

			switch (args) {
			case "chrome":
				launchChromeDriver();
				break;

			case "ie":
				launchInternetExplorer();
				break;

			case "appium":
				launchAppiumDriver();
				break;

			case "cloud":
				launchCloudWebDriver();
				break;

			default:
				System.out.println("Invalid Web Driver Input.");
				break;

			}

		} catch (Exception e) {
			System.out.println("Exception is *****" + e.getMessage());
		}

	}
	


//	@Override
//	public void afterAll(ExtensionContext arg0) throws Exception {
//		driver.close();
//		
//	}

}
