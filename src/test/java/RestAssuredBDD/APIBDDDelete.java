package RestAssuredBDD;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;

public class APIBDDDelete {
	
	@Test
	public void deletedata() {
		RestAssured.baseURI= "https://reqres.in/api/users";
		RestAssured.basePath="/2";
		
		given()
		 .when()
		 .delete()
		 .then()
		 .statusCode(204)
		 .log().all();
		 
	}
}
