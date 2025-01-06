package com.api.tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class abc {

	
	@Test
	public void abc123() { 
	RestAssured.baseURI= "http://64.227.160.186:8080";
		  RestAssured.given()
          .baseUri("https://api.example.com")
          .header("Authorization", "Bearer token")
          .when()
          .get("/endpoint")
          .then()
          .statusCode(401)
          .log().all();
  }
	
}
