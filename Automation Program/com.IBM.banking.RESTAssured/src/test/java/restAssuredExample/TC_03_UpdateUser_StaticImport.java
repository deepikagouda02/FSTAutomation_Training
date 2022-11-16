package restAssuredExample;

import org.json.simple.JSONObject;

import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import static io.restassured.matcher.RestAssuredMatchers.*;

import static org.hamcrest.Matchers.*;

import io.restassured.http.Method;

import io.restassured.response.Response;

import io.restassured.specification.RequestSpecification;

public class TC_03_UpdateUser_StaticImport {

	String ibm_name = "Abhishek";

	String ibm_role = "leader";

	@Test()

	public void verifyCreateuserTest() throws Exception {

		JSONObject requestBody = new JSONObject();

		requestBody.put("name", ibm_name);

		requestBody.put("job", ibm_role);

		baseURI = "https://reqres.in/";

		given().

				header("Content-Type", "application/json").

				body(requestBody).

				when().

				// put("/api/users/2").

				put("/api/users/{id}", 2).

				then().

				statusCode(200).

				body("name", equalTo(ibm_name)).

				body("job", equalTo(ibm_role)).

				log().all();

	}

}
