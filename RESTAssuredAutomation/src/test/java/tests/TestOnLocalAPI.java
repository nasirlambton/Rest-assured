package tests;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;


public class TestOnLocalAPI {
	
	@Test
	public void get() {
		baseURI = "http://localhost:3000";
		
		given().
		when().
		get("/users").
		then().
		statusCode(200).
		log().all();
	}
	
//	@Test
//	public void post() {
//		baseURI = "http://localhost:3000";
//
//		JSONObject request = new JSONObject();
//		request.put("firstname", "uddin");
//		request.put("lastname", "ed");
//		request.put("subjectId", 1);
//
//		baseURI = "http://localhost:3000";
//		
//		given().
//		contentType(ContentType.JSON).accept(ContentType.JSON).
//		body(request.toJSONString()).
//		when().
//		post("/users").
//		then().
//		statusCode(201).
//		log().all();
//	}
	
//	public void put() {
//		baseURI = "http://localhost:3000";
//
//		JSONObject request = new JSONObject();
//		request.put("firstname", "Albert");
//		request.put("lastname", "Enstien");
//		request.put("subjectId", 2);
//
//		baseURI = "http://localhost:3000";
//		
//		given().
//		contentType(ContentType.JSON).accept(ContentType.JSON).
//		body(request.toJSONString()).
//		when().
//		put("/users?id=b6c7").
//		then().
//		statusCode(200).
//		log().all();
//	}
	
	@Test
	public void delete() {
		baseURI = "http://localhost:3000";
		
		given().
		when().
		delete("/users/1").
		then().
		statusCode(200).
		log().all();
	}
	

}
