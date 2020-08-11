package RestAssuredBDD;

import java.util.HashMap;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
import com.sun.xml.xsom.impl.scd.Iterators.Map;
import io.restassured.RestAssured;

public class APIBDDPut {
	
	public static HashMap map = new HashMap();
	@BeforeClass
	public void putmethod() {
		map.put("name", "morpheus");
		map.put("job", "Engineer");
		RestAssured.baseURI= "https://reqres.in/api/users";
		RestAssured.basePath="/2";	
	}
	@Test
	public void sendupdate() {
		
		given()
		.contentType("application/json")
		.body(map)
		.when()
		.put()
		.then()
		.statusCode(200);
		
	}
	
}
