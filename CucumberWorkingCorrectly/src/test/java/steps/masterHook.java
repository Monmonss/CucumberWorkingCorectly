package steps;

import factory.Factory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.IOException;

public class masterHook extends Factory {

    @Before
    public void before() throws IOException {
        driver = createDriver();


    }

    @After
    public void after() {
        try {
            if(driver!=null) {
                driver.manage().deleteAllCookies();
                driver.quit();
                driver=null;
            }



        } catch (Exception e) {
        }
    }
}
