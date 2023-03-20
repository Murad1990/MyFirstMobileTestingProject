package activity;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import utilities.BasePage;
import utilities.Driver;

public class LoginDialogWindow extends BasePage{
    private WebElement actualMessage = appiumDriver.findElement(AppiumBy.id("android:id/message"));
    private WebElement okButton = appiumDriver.findElement(AppiumBy.id("android:id/button1"));

    public String getActualMessage() {
        return actualMessage.getText();
    }
    public void clickOkButton() {
        okButton.click();
    }
}
