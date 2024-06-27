package tests;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;


public class PutPatchDelete {
	
	@Test
	public void testPut() {
		JSONObject request = new JSONObject();
		request.put("name", "Nas");
		request.put("job", "QA");
		System.out.println(request);
		
		baseURI = "https://reqres.in/api";
		
		given().
		header("content-type","application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
		when().
		put("/users/2").
		then().
		statusCode(200).
		log().all();

		
	}
	
	@Test
	public void testPatch() {
		JSONObject request = new JSONObject();
		request.put("name", "Nas");
		request.put("job", "QA");
		System.out.println(request);
		
		baseURI = "https://reqres.in/api";
		
		given().
		header("content-type","application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
		when().
		patch("/users/2").
		then().
		statusCode(200).
		log().all();

	}
	
	@Test
	public void testDelte() {
		JSONObject request = new JSONObject();
		request.put("name", "Nas");
		request.put("job", "QA");
		System.out.println(request);
		
		baseURI = "https://reqres.in/api";
		
		when().
		delete("/users/2").
		then().
		statusCode(204).
		log().all();

	}
	
	
}
