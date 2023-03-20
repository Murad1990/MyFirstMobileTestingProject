package activity;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import utilities.BasePage;


public class LoginPage extends BasePage {
    private WebElement emailTextBox = appiumDriver.findElement(AppiumBy.accessibilityId("input-email"));
    private WebElement passwordTextBox = appiumDriver.findElement(AppiumBy.accessibilityId("input-password"));
    private WebElement loginButton2 = appiumDriver.findElement(AppiumBy.accessibilityId("button-LOGIN"));

    public void login(String username, String password){
        emailTextBox.sendKeys(username);
        passwordTextBox.sendKeys(password);
        loginButton2.click();
    }

}
