package RestAssuredBDD;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class APIBDDDelete {
	
	@Test
	public void deletedata() {
		RestAssured.baseURI= "https://reqres.in/api/users";
		RestAssured.basePath="/2";
	
		Response response =
		given()
		 .when()
		 .delete()
		 .then()
		 .statusCode(204)
		 .log().all()
		 .extract().response();
		String jsonresponse = response.asString();
		System.out.println(jsonresponse);
	}
}
