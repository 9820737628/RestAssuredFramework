package com.api.models.request;

public class SignUpRequest {

   private String username;
   private String   password;
   private String   email;
   private String  firstName;
   private String  lastName;
   private String   mobileNumber;
   
public SignUpRequest(String username, String password, String email, String firstName, String lastName,
		String mobileNumber) {
	super();
	this.username = username;
	this.password = password;
	this.email = email;
	this.firstName = firstName;
	this.lastName = lastName;
	this.mobileNumber = mobileNumber;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
@Override
public String toString() {
	return "SignUpRequest [username=" + username + ", password=" + password + ", email=" + email + ", firstName="
			+ firstName + ", lastName=" + lastName + ", mobileNumber=" + mobileNumber + "]";
}
	

public static class Buider{

	   private String username;
	   private String   password;
	   private String   email;
	   private String  firstName;
	   private String  lastName;
	   private String   mobileNumber;
	   
	   public Buider userName(String username) {
		   this.username = username;
		  Buider x = this;
		   return x; 
	   }
	   public Buider password(String password) {
		   this.password = password;
		  return this;
	   }
	   public Buider email(String email) {
		   this.email = email;
		  return this;
	   }
	   public Buider firstName(String firstName) {
		   this.firstName = firstName;
		  return this;
		  
	   } public Buider lastName(String lastName) {
		   this.lastName = lastName;
		  return this;
		  
	   } public Buider mobileNumber(String mobileNumber) {
		   this.mobileNumber = mobileNumber;
		  return this;
	   }
	   
	   public SignUpRequest build() {
		 SignUpRequest signUpRequest  = new SignUpRequest(username, password, email, firstName, lastName, mobileNumber); 
	     return signUpRequest;
	   }
	   
}

}
