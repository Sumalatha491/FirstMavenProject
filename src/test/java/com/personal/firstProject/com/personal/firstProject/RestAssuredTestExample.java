package com.personal.firstProject.com.personal.firstProject;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredTestExample {
  @Test
  public void E2ETests() {
	  
	  RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
	  
	  RequestSpecification specification = RestAssured.given();
	  Response response = specification.get("/Hyderabad");
	  
	  System.out.println("Status code is "+ response.getStatusCode());
	  System.out.println("Response message is "+ response.asString());
	  System.out.println("Response header is " +response.getHeader("Content-Type" ));
	  System.out.println("Response get header is "+ response.header("Content-Type"));
	  
  }
  
  @Test
  public void postMethod()
  {
	  RestAssured.baseURI = "http://restapi.demoqa.com/customer";
	  RequestSpecification request = RestAssured.given();
	  
	  JSONObject jsonobj = new JSONObject();
	  jsonobj.put("FirstName", "Virender"); 
	  jsonobj.put("LastName", "Singh");

	  jsonobj.put("UserName", "simpleuser001");
	  jsonobj.put("Password", "password1");
	  jsonobj.put("Email",  "someuser@gmail.com");
	  
	  request.header("Content-Type", "application/json");
	  request.body(jsonobj.toJSONString());
	  
	  Response response = request.post("/register");
	  
	  System.out.println("response code is " + response.getStatusCode());
	  System.out.println("success code is "+ response.jsonPath().get("SuccessCode"));
	  Assert.assertEquals(response.getStatusCode(), 200);
	  
	  
	  
 }
}
