package com.megatechs.restassured;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice {
@Test
    public void practice (){

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        RequestSpecification req = RestAssured.given();
        Response response = req.request(Method.GET,"/users");
        int ActualStatusCode = response.getStatusCode();
    System.out.println("StatusCode: "+response.getStatusCode());
    Assert.assertEquals(ActualStatusCode, 200);


    System.out.println();// ================================

    Headers headers = response.headers();
    System.out.println("Headers: "+response.headers());

    System.out.println("================headers======================");

    String server = response.header( "Server");
    System.out.println("Server: "+server);

    Assert.assertEquals(server, "cloudflare");

    System.out.println("=============body===============");

//    ResponseBody body = response.body();
//    String stringbody = response.body().asString();
//    System.out.println("stringbody "+stringbody);

    System.out.println("================jsonpath==============");
    ResponseBody body2 = response.body();
    response.body().jsonPath().prettify();
    System.out.println(response.body().jsonPath().prettify());





    }
}
