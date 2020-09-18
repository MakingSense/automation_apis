package apis;

import utils.Logger;

import static com.jayway.restassured.RestAssured.given;


public class JSONPlaceHolder {

    public static int getStatusCode(String URL) {
        Logger.printDebug("Getting the status code");

        return given().get(URL).statusCode();
    }

    public static int getPosts(String URL) {
        return given().get(URL).getBody().jsonPath().getList("title").size();
    }
}
