package WikipediaTests;

import com.jayway.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.Logger;

import static apis.JSONPlaceHolder.getPosts;
import static apis.JSONPlaceHolder.getStatusCode;

public class BasicTest {

    Response response;

    @Parameters({ "URL" })
    @Test
    public void getResponseCode(String URL) {
        int response = getStatusCode(URL);

        Logger.printInfo("Status code received: " + response);

        Assert.assertEquals(response, 200, "The status code is not 200");
    }

    @Parameters({ "URL" })
    @Test
    public void getAllPosts(String URL) {
        Logger.printInfo("Number of posts: " + getPosts(URL));
    }

   /* @Parameters({ "URL", "singlePost" })
    @Test(enabled = false)
    public void getSinglePost(String URL, int singlePost) {
        response = getPosts(URL, singlePost);
    }*/

    @Test(enabled = false)
    public void createAPost() {

    }

    @Test(enabled = false)
    public void updateAPost() {

    }

    @Test(enabled = false)
    public void deleteAPost() {

    }

    @Test(enabled = false)
    public void filterPostsByUserId() {

    }
}
