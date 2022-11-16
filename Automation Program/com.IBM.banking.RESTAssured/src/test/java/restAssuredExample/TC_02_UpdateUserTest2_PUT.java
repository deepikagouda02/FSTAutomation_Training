
package restAssuredExample;

import org.json.simple.JSONObject;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import io.restassured.http.Method;

import io.restassured.response.Response;

import io.restassured.specification.RequestSpecification;

public class TC_02_UpdateUserTest2_PUT {

	RequestSpecification httpRequest;

	@Test

	public void verifyCreateuserTest() {

//      {

//          "name": "morpheus",

//          "job": "leader"

//      }

		JSONObject requestBody = new JSONObject();

		requestBody.put("name", "Anbarasu");

		requestBody.put("job", "leader");

		System.out.println(requestBody.toJSONString());

		RestAssured.baseURI = "https://reqres.in/";   

		// Request Object

		httpRequest = RestAssured.given();

		// Header

		httpRequest.header("Content-Type", "application/json");

		// Request

		httpRequest.body(requestBody);

		// Response Object

		Response resp = httpRequest.request(Method.PUT, "/api/users/2");

		System.out.println(resp.asPrettyString());

		System.out.println(resp.getStatusCode());

	}

}
