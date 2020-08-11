package apiTestONE;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIfourAllHeaders {

	@Test
	void allheadersvalidation() {
		RestAssured.baseURI="https://reqres.in/api/users/api/unknown";
		RequestSpecification requType = RestAssured.given();
		
		Response response = requType.request(Method.GET, "/2");
		
		String body=response.getBody().asString();
		System.out.println("The body is :" + body);
		
		String statusLine=response.statusLine();
		System.out.println("Status Line is :" + statusLine);
		
		Headers allheaders = response.headers();
		
		for(Header header:allheaders) {
			System.out.println(header.getName()  + "    " + header.getValue());
		}
		
	}
}
