package apiTestONE;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIthreeGetRsq {
	
	@Test
	void getrequestfromresq(){
		
		RestAssured.baseURI="https://reqres.in/api/users";
		RequestSpecification requType = RestAssured.given();
		
		Response response = requType.request(Method.GET, "/2");
		
		String body=response.getBody().asString();
		System.out.println("The body is :" + body);
		
		String statusLine=response.statusLine();
		System.out.println("Status Line is :" + statusLine);
		
		String contentone=response.header("CF-Cache-Status");
		System.out.println("status is : " + contentone);
		String contenttwo=response.header("Server");
		System.out.println("Server is : " + contenttwo);
		String contentthree = response.header("Content-Type");
		System.out.println("Content Type is : "+ contentthree);
	}

}
