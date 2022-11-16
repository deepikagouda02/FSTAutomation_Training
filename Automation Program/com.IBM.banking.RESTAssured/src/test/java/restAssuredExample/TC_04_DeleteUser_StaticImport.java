



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



public class TC_04_DeleteUser_StaticImport {

    

    

    

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

            //body(requestBody).

        

        when().

            //put("/api/users/2").

            delete("/api/users/{id}", 2).

        

        then().

            statusCode(204).

            log().all();

        

        

        

    }

    

    

    



}