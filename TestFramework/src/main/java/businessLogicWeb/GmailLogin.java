package businessLogicWeb;

import org.openqa.selenium.By;

import java.util.logging.Logger;

import org.junit.Assert;

import serviceNow.BaseClass;
import serviceNow.mainInputFile;

public class GmailLogin extends BaseClass {
	Logger logger = Logger.getLogger(GmailLogin.class.getName());

	String userNameXpath = "//input[@type='email']";
	String gmailUserName = "ABCD";
	String url = "https://gmail.com";
	String signInPageVerification = "//span[text()[contains(.,'Next')]]";

	public void gmailLogin() {
		BaseClass bc = new BaseClass();
		bc.launchbrowser(mainInputFile.input().get("browser").toString());

		// Step 1 : Send user name
		bc.driver.get(url);

		try {
			Assert.assertTrue(bc.driver.findElement(By.xpath(signInPageVerification)).isDisplayed());
			logger.info("Next Button does appear on screen.");
		} catch (Exception e) {
			logger.info("Next Button does not appear on screen." + e);

		}
		bc.driver.findElement(By.xpath(userNameXpath)).sendKeys(gmailUserName);
		bc.driver.close();
	}
	
	

}