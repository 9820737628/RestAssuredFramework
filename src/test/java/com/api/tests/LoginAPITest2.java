package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


@Listeners(com.api.listeners.TestListere.class)
public class LoginAPITest2 {

@Test( description = "Verfit Login API is working")	
public void Logintest() { 
	RestAssured.baseURI= "http://64.227.160.186:8080";
	RequestSpecification x = RestAssured.given();
	RequestSpecification Y = x.header("Content-Type", "application/json");
    RequestSpecification Z = Y.body("{\"username\": \"111111\",\"password\": \"111111\"}");
	Response response =  Z.post("api/auth/login");
	
	
	
	
	
	System.out.println(response.asPrettyString());
	 Assert.assertEquals(response.getStatusCode(), 200);
	
   }	
	
}
