package restAssuredExample;



import org.testng.annotations.Test;



import io.restassured.RestAssured;

import io.restassured.http.Method;

import io.restassured.response.Response;



public class TC_01_ListUser {

    

    

    @Test

    public void verifyListUserTest() {

        

        //Specify base URI

        //RestAssured.baseURI = "https://reqres.in/";

        

        

        Response resp = RestAssured.given().request(Method.GET, "https://reqres.in/api/users?page=2");     //request sent to server

        

        System.out.println(resp.asString());

        System.out.println(resp.asPrettyString());

        

        

    }



}

