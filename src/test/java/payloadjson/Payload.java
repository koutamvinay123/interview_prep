package payloadjson;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.*;
public class Payload {

    @Test
    public void method() throws IOException {
        RestAssured.baseURI="http://216.10.245.166";
        String response = given().log().all().header("Content-Type", "application/json").
                body(new String(Files.readAllBytes(Paths.get("C:\\Users\\k chandrakanth\\OneDrive\\Documents\\Vinay\\Filename.json")))).
                when().post("Library/Addbook.php").then().log().all().extract().response().asString();
        JsonPath js = new JsonPath(response);
                String s = js.get("ID");
        System.out.println(s);
    }
}
