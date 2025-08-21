package org.assured;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;

import java.io.File;

import static io.restassured.RestAssured.*;

public class ParamsClass {
    public static void main(String[] args) {
        RestAssured.baseURI = "http://localhost:8080/";
        SessionFilter sf = new SessionFilter();
        given().header("Content-Type", "application/json").body("{\r\n" +

                "    \"username\": \"RahulShetty\",\r\n" +

                "    \"password\": \"Master!11\"\r\n" +

                "}").log().all().filter(sf).when().post("/rest/auth/1/session").then().log().all().extract().response().asString();

        given().header("X-Atlassian-Token","no-check").filter(sf).pathParam("key", "10101")

                .header("Content-Type","multipart/form-data")

                .multiPart("file",new File("attach.txt")).when().

                post("rest/api/2/issue/{key}/attachments").then().log().all().assertThat().statusCode(200);
    }
}
