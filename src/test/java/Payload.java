import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.internal.path.json.mapping.JsonObjectDeserializer;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import netscape.javascript.JSObject;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.logging.SocketHandler;

public class Payload {
@Test
    public void payload () {

        RestAssured.baseURI = "https://reqres.in";
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");

        JSONObject jo = new JSONObject();

        jo.put("name","Shafiq");

        jo.put("id","QA");

        request.body(jo.toString());
        Response response = request.request("/api/users?page=2");

        System.out.println(jo.toString());

    //System.out.println("===================================");


    Response s = request.request(Method.GET,"application/json");
    ResponseBody bodyB = s.getBody();
    String B = bodyB.asPrettyString();
    System.out.println(bodyB.asPrettyString());




    }
}
