package utilities;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    protected PagesObjects pagesObjects;
    protected AppiumDriver appiumDriver;
    @BeforeMethod
    public void setUp(){

        appiumDriver = Driver.getDriver();
        pagesObjects = new PagesObjects();

    }

    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }

}
