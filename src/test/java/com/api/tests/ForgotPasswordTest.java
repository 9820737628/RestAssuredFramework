package com.api.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignUpRequest;

import io.restassured.response.Response;

public class ForgotPasswordTest {

	@Test(description = "Verify Forgot Password API is working fine")
	
	public void forgorPasswordTest() {
		
		AuthService authService = new AuthService();
		Response response =authService.forgotPassword("Disha1234@yahoo.com");
	    System.out.println(response.asPrettyString());
	}
		
	
		
	
}
