package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponcse;
import com.api.models.response.UserProfileResponce;

import io.restassured.response.Response;

public class GetProfileRequestTest {

	
	@Test
	
	public void getProfileInfoTest() {
		AuthService authService = new AuthService();
		Response response = authService.login(new LoginRequest("111111", "111111"));
		LoginResponcse loginResponcse = response.as(LoginResponcse.class);
		System.out.println(loginResponcse.getToken());
		// get token from above code
		
		UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
	     response = userProfileManagementService.getProfile(loginResponcse.getToken());
	    System.out.println(response.asPrettyString());
	   UserProfileResponce  userProfileResponce = response.as(UserProfileResponce.class);
	   System.out.println(userProfileResponce.getUsername()); 
	}
}
