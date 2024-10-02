package serviceNow;

import org.junit.After;
import org.junit.Test;

import businessLogicWeb.GmailLogin;

public class WebGmailLoginTest {
	
	GmailLogin login = new GmailLogin();

	/*
	 * Author: Omkar Deshpande
	 * Purpose: To verify gmail login 
	 */
	@Test
	public void verifyGmailLogin() {
		login.gmailLogin();
		
	}

}
