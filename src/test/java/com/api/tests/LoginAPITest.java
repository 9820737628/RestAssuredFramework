package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

//https://tech-with-jatin.notion.site/E2E-Automation-Framework-Creation-1526d427c22780328b8fff211ee050b7
//http://64.227.160.186:8080/swagger-ui/index.html#/Authentication/authenticateUser
//https://swift.techwithjatin.com/dashboard

public class LoginAPITest {


@Test( description = "Verfit Login API is working")	
public void Logintest() { 
	
	Response response = given().baseUri("http://64.227.160.186:8080")     
			.header("Content-Type", "application/json").body("{\"username\": \"111111\",\"password\": \"111111\"}").post("api/auth/login");
	
	
	
	
	System.out.println(response.asPrettyString());
	Assert.assertEquals(response.getStatusCode(), 200);
	
   }	
	
}
