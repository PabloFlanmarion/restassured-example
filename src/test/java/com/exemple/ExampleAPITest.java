package com.exemple;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

import org.junit.jupiter.api.Test;

import com.jayway.restassured.RestAssured;

public class ExampleAPITest {

	@Test
	public void example1() {
		RestAssured.baseURI = "http://localhost:8080/actuator/info";
		given().contentType("application/json").when().get().then().statusCode(200).body("message",
				containsString("User created successfully"));
	}
}
