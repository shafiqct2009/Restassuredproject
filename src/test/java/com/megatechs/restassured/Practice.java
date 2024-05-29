package com.megatechs.restassured;


import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Practice {
@Test
public void practice (){
    RestAssured.baseURI = "https://reqres.in";
    RequestSpecification req = RestAssured.given();
    req.header("Content-Type","application/json");
    JSONObject jo = new JSONObject();
    jo.put("name","Shafiq Alam");
    jo.put("post","qa");
    jo.put("email","gmail.com");
    jo.put("city","Stamford");
    jo.put("State","Connecticut");
    req.body(jo.toJSONString());
    System.out.println(jo.toJSONString());
    
    Response response = req.request(Method.GET,"/api/users?page=2");
    String bodyas_json = response.body().jsonPath().prettify();

    System.out.println("bodyas_json: "+bodyas_json);




    }
}
