package restAssuredExample;

import org.testng.Assert;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import io.restassured.http.Method;

import io.restassured.response.Response;

import io.restassured.specification.RequestSpecification;

public class TC_01_ListUser_Recap {

	Response resp;

	@BeforeTest

	public void setup() {

		// Specify base URI

		RestAssured.baseURI = "https://reqres.in"; // environment - QA/DEV/Prod/stage

		// Request Object

		RequestSpecification httpRequest = RestAssured.given();

		// header

		// parameter

		// auth token

		// Response Object

		resp = httpRequest.request(Method.GET, "/api/users?page=2"); // request sent

		// to server

	}

	@Test

	public void verifyContent() {

		System.out.println(resp.contentType());

		System.out.println(resp.getStatusCode());

		System.out.println(resp.getTime());

		System.out.println(resp.getHeaders().getValue("X-Powered-By"));

	}

	@Test

	public void verifyStatusCode() {

		int actualStatusCode = resp.getStatusCode(); // Status Code : 200

		System.out.println("StatusCode: " + actualStatusCode);

		Assert.assertEquals(actualStatusCode, 200);

	}

	@Test

	public void verifyContentType() {

		String actualContentType = resp.getContentType(); // application/json; charset=utf-8

		System.out.println("ContentType: " + actualContentType);

		Assert.assertEquals(actualContentType, "application/json; charset=utf-8");

		Assert.assertTrue(actualContentType.contains("json"));

	}

	@Test

	public void verifyHeader_TransferEncoding() {

		String actualEncoding = resp.getHeader("Transfer-Encoding"); // chunked

		System.out.println("actualEncoding: " + actualEncoding);

		Assert.assertEquals(actualEncoding, "chunked");

	}

}
