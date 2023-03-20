package activity;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import utilities.BasePage;


public class MainPage extends BasePage {
    private WebElement loginButton = appiumDriver.findElement(AppiumBy.accessibilityId("Login"));
    private WebElement formsButton = appiumDriver.findElement(AppiumBy.accessibilityId("Forms"));
    private WebElement homeButton = appiumDriver.findElement(AppiumBy.accessibilityId("Home"));

    public void clickLoginMenu(){
        loginButton.click();
    }

    public void clickHomeButton(){
        try{
            Thread.sleep(2000);
            homeButton.click();
        }catch (Exception e){
        }

    }

    public void clickFormsButton(){
        formsButton.click();
    }



}
