package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.request.ProfileRequest;
import com.api.models.response.LoginResponcse;
import com.api.models.response.UserProfileResponce;

import io.restassured.response.Response;

public class UpdateProfileTest {

	
	@Test
	
	public void getProfileInfoTest() {
	 
		AuthService authService = new AuthService();
		Response response =  authService.login(new LoginRequest("111111", "111111"));
	LoginResponcse loginResponcse	=  response.as(LoginResponcse.class);
	System.out.println(response.asPrettyString());
	
	System.out.println("....");
	
	
	  UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
	  response = userProfileManagementService.getProfile(loginResponcse.getToken());
	System.out.println(response.asPrettyString());
    UserProfileResponce userProfileResponce =	response.as(UserProfileResponce.class);
	Assert.assertEquals(userProfileResponce.getUsername(),"111111");
	
	System.out.println("....");
	
	ProfileRequest profileRequest = new ProfileRequest.Builder()
			.FirstName("Disha")
			.lastName("Bhat")
			.email("disha.bhat@gmail.com")
			.mobileNumber("7777777771")
			.build();
	
	

	response = userProfileManagementService.UpdateProfile(loginResponcse.getToken(),profileRequest);
	System.out.println( response.asPrettyString() );
	
	}
}
