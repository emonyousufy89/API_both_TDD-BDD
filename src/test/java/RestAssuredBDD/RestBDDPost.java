package RestAssuredBDD;

import java.util.HashMap;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class RestBDDPost {

	HashMap map = new HashMap();

	@BeforeClass
	public void postinfo() {
		map.put("name", "emon");
		map.put("put", "Manager");
		RestAssured.baseURI= "https://reqres.in/api";
		RestAssured.basePath= "/users";
	}
	@Test

	public void sendpostrequ() {

		given()
		.contentType("application/json")
		.body(map)
		.when()
		.post()
		.then()
		.statusCode(201);
		




	}
}
