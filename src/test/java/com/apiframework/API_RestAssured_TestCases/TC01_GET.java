package com.apiframework.API_RestAssured_TestCases;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class TC01_GET {

    @Test
    public void TC01_Negative01(){
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking/-1").log().all();
        requestSpecification.when().get();
        requestSpecification.then().log().all().statusCode(404);
    }
    @Test
    public void TC02_Negative2(){
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking/abc").log().all();
        requestSpecification.when().get();
        requestSpecification.then().log().all().statusCode(404);
    }
    @Test
    public void TC02_Negative3(){
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking/a_c").log().all();
        requestSpecification.when().get();
        requestSpecification.then().log().all().statusCode(404);
    }
}
