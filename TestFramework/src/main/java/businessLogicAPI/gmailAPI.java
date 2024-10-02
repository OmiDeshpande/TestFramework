package businessLogicAPI;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class gmailAPI {
	
	//String baseURL="https://demoqa.com";
	//String baseURL="http://google.com";
	public void getAPI() {
		//String baseURL=mainInputFile.input().get("baseURL").toString();
		
	
		
//		RestAssured.baseURI =  baseURL;
//		System.out.println("Base URL IS::"+RestAssured.baseURI);
//		
//		//First we need to create httpRequest object from RestAssured Request Specification
//		RequestSpecification httpRequest = RestAssured.given();
//		
//		
//		//get response 
//		Response response = httpRequest.request(Method.GET, "/BookStore/v1/Books");
//		System.out.println("Status code"+response.getStatusCode());
//	
		
		
		RestAssured.baseURI = "https://demoqa.com"; 
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET,"/BookStore/v1/Books");
		System.out.println("Status received => " + response.getBody()); 
//		System.out.println("Response=>" + response.prettyPrint());


			
	}

}
