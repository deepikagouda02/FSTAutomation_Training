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



public class TC_02_CreateGITHUB_Repo2 {



    RequestSpecification httpRequest;



    @Test()



    public void verifyTest() throws Exception {



        JSONObject requestBody = new JSONObject();



        requestBody.put("name", "SampleData");



        



        baseURI = "https://api.github.com";



        given().



                header("Content-Type", "application/json").

                auth().oauth2("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").



                body(requestBody).



        when().



                post("/user/repos").



        then().



                statusCode(201).

                log().all();



        Thread.sleep(3000);



    }



    

}