package com.api.filters;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;

public class LoggingFilter implements Filter{

	
	private static final Logger logger = LogManager.getLogger(LoggingFilter.class);
	@Override
	public Response filter(FilterableRequestSpecification requestSpec, FilterableResponseSpecification responseSpec,
			FilterContext ctx) {
		logRequest(requestSpec);
		 Response response= ctx.next(requestSpec, responseSpec);
		logResponce(response);
		 
		 return response;   //Test for Assertion
	}
	
	public void logRequest(FilterableRequestSpecification requestSpec) {
		   logger.info("Base URI" + requestSpec.getBaseUri());
		   logger.info("Request Header" + requestSpec.getHeaders());
		   logger.info("Request Payload" + requestSpec.getBody());
//		   logger.info("Base URI" + requestSpec.getBaseUri());
	}
	
	public void logResponce(Response response) {
		logger.info("Status COde URI" + response.getStatusCode());
		 logger.info("Respoce header" + response.getHeaders());
		   logger.info("Request Body" + response.getBody().prettyPrint());
		  
//		   logger.info("Base URI" + requestSpec.getBaseUri());
	}
	

}
