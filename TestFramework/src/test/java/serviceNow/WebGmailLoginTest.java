package serviceNow;

import org.junit.After;
import org.junit.Test;

import businessLogicWeb.GmailLogin;

public class WebGmailLoginTest {
	
	
	/*
	 * Author: Omkar Deshpande
	 * Purpose: To verify gmail login 
	 */
	@Test
	public void verifyGmailLogin() {
		GmailLogin login = new GmailLogin();
		login.gmailLogin();
		
	}

}
