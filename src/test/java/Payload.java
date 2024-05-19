import io.restassured.RestAssured;
import io.restassured.internal.path.json.mapping.JsonObjectDeserializer;
import io.restassured.response.Response;
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
        request.body(jo.toJSONString());
        Response response = request.request("/api/users");




    }
}
