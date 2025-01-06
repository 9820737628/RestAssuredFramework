package com.api.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignUpRequest;

import io.restassured.response.Response;

public class AccountCreationTest {

	@Test(description = "Verify Account is created")
	
	public void createdAccountTest() {
		
	 SignUpRequest signUpRequest  = new SignUpRequest.Buider()
	  .userName("DIsha126391")
	  .password("Disha126312")
	  .firstName("Disha1413")
	 .email("Disha123419@yahoo.com")
	 .lastName("Patni12219")
	 .mobileNumber("1289567809")
	 .build();
		
	AuthService authService = new AuthService();
	Response response = authService.signUp(signUpRequest);
	System.out.println(response.asPrettyString());
	Assert.assertEquals(response.asPrettyString(),"User registered successfully!");
	Assert.assertEquals(response.statusCode(), 200);
	}
		
	
}
