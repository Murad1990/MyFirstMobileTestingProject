package utilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.testng.Assert;

public class BasePage {

    protected AppiumDriver appiumDriver = Driver.getDriver();
    public void compareResults(String actual, String expected){
        Assert.assertEquals(actual,expected);
    }

    public void checkResult(boolean conditionStatement, boolean trueOrFalse){
        if(true){
            Assert.assertTrue(conditionStatement);
        }else{
            Assert.assertFalse(conditionStatement);
        }
    }

    public void scrollDown(){
        appiumDriver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(100000)"));
    }
}
