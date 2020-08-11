package apiTestONE;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class APIoneGet {

	@Test
	
	void getemployeedetails() {
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1/employee";
		RequestSpecification requestType = RestAssured.given();
		Response response = requestType.request(Method.GET,"/1");
		
		String resbody = response.getBody().asString();
		System.out.println("Rsponse body is : " + resbody);
		
		int statuscode = response.getStatusCode();
		System.out.println("The status code is :" + statuscode);
		Assert.assertEquals(statuscode, 200);
		
		String statusLine=response.statusLine();
		System.out.println("Status Line is :" + statusLine);
	}
}
