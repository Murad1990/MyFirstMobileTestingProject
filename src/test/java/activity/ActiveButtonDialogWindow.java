package activity;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import utilities.BasePage;

public class ActiveButtonDialogWindow extends BasePage {

    private WebElement actualActiveButtonMessage = appiumDriver.findElement(AppiumBy.id("android:id/message"));
    private WebElement okButton = appiumDriver.findElement(AppiumBy.id("android:id/button1"));

    public String getActiveButtonMessage(){
        return actualActiveButtonMessage.getText();
    }

    public void clickOkButton(){
        okButton.click();
    }
}
