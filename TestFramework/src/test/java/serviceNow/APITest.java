package serviceNow;

import org.junit.Test;

import businessLogicAPI.gmailAPI;

public class APITest {
	gmailAPI gapi= new gmailAPI();
	/*
	 * Author: Omkar Deshpande
	 * Purpose: To verify gmail login 
	 */
	@Test
	public void testApi() {
		gapi.getAPI();
	}

}
