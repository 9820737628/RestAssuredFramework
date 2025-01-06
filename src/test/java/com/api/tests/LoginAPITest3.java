package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponcse;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

//https://tech-with-jatin.notion.site/E2E-Automation-Framework-Creation-1526d427c22780328b8fff211ee050b7
//http://64.227.160.186:8080/swagger-ui/index.html#/Authentication/authenticateUser
//https://swift.techwithjatin.com/dashboard

public class LoginAPITest3 {


@Test( description = "Verfit Login API is working")	
public void Logintest() { 
	LoginRequest loginRequest = new LoginRequest("111111","111111");
	
	
	AuthService authservie = new AuthService();
    Response response = authservie.login(loginRequest);
    LoginResponcse loginResponcse = response.as(LoginResponcse.class);
    
    System.out.println(response.asPrettyString());
    System.out.println(loginResponcse.getToken());
    System.out.println(loginResponcse.getEmail());
    System.out.println(loginResponcse.getId());
    System.out.println(loginResponcse.getUsername());
    
    Assert.assertTrue(loginResponcse.getToken() != null );
    Assert.assertEquals(loginResponcse.getEmail(),"111111@gmail.com");
    
   }	
	
}
