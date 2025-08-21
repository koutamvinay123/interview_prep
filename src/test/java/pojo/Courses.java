package pojo;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class Courses {
    private String gaza;

    public String getGaza()
    {
        return gaza;
    }    public void setGaza(String gaza){
        this.gaza = gaza;
    }
    RequestSpecification rs = new RequestSpecBuilder().setBaseUri("http://216.10.245.166").build();
}
