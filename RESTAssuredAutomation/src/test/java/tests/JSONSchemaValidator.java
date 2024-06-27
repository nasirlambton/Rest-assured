package tests;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import org.testng.annotations.Test;

public class JSONSchemaValidator {
	
	@Test
	public void get() {
		baseURI = "https://reqres.in/api";
		
		given().
		when().
		get("/users").
		then().
		assertThat().body(matchesJsonSchemaInClasspath("schema.json")).
		statusCode(200).
		log().all();
	}

}
