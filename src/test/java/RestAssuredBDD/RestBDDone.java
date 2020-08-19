package RestAssuredBDD;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

/*
 * given() cookies, add auth, add parameters, set header info etc
 * when() get post put delete
 * then() validate, extract responss, extract headers cookies & response body
 */
public class RestBDDone {

	@Test
	public void BDDgetrequ() {
		given()
		
		.when()
		.get("https://reqres.in/api/users/2")
		.then()
		.statusCode(200);
		
	}



}
