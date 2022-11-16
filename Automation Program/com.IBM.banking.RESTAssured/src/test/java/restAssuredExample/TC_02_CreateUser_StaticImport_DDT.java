package restAssuredExample;

import org.json.simple.JSONObject;

import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

//import static io.restassured.matcher.RestAssuredMatchers.*;
//
//import static org.hamcrest.Matchers.*;

import io.restassured.http.Method;

import io.restassured.response.Response;

import io.restassured.specification.RequestSpecification;

public class TC_02_CreateUser_StaticImport_DDT {

	RequestSpecification httpRequest;

	@Test(dataProvider = "smokeData")

	public void verifyCreateuserTest(String ibm_name, String ibm_role) throws Exception {

		JSONObject requestBody = new JSONObject();

		requestBody.put("name", ibm_name);

		requestBody.put("job", ibm_role);

		baseURI = "https://reqres.in/";

		given().

				header("Content-Type", "application/json").

				body(requestBody).

		when().

				post("/api/users").

		then().

				statusCode(201).

				//body("name", equalTo(ibm_name)).

				//body("job", equalTo(ibm_role)).

				log().all();

		Thread.sleep(3000);

	}

	@DataProvider

	public Object[][] smokeData() {

		Object[][] data = { { "Anbarasu", "leader" }, { "Bhavana", "sr.leader" }, { "Neha", "sr.leader" },
				{ "Sanjeev", "leader" } };

		return data;

	}

}
