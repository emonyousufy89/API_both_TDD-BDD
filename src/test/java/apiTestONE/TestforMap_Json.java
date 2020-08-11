package apiTestONE;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestforMap_Json {
		
	@Test
	void Postemployeedetails() {
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		RequestSpecification requestType = RestAssured.given();
		
		
		HashMap requestParam= new HashMap();
		requestParam.put("name", "John");
		requestParam.put("salary", "12000");
		requestParam.put("age", "29");
		
		requestType.header("Content-Type", "application/json");
		requestType.body(requestParam.toString());
		
		Response response = requestType.request(Method.POST,"/create");
		
		String resbody = response.getBody().asString();
		System.out.println("Rsponse body is : " + resbody);
		
		int statuscode = response.getStatusCode();
		System.out.println("The status code is :" + statuscode);
		//Assert.assertEquals(statuscode, 201);
		
		String successcode= response.jsonPath().get("SucsessCode");
		System.out.println(successcode);
		
	}
}
