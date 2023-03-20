package activity;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import utilities.BasePage;


public class FormPage extends BasePage {
    private WebElement inputField = appiumDriver.findElement(AppiumBy.accessibilityId("text-input"));
    private WebElement inputTextResultFiled = appiumDriver.findElement(AppiumBy.accessibilityId("input-text-result"));
    private WebElement switchButton = appiumDriver.findElement(AppiumBy.accessibilityId("switch"));
    private WebElement switchText = appiumDriver.findElement(AppiumBy.accessibilityId("switch-text"));
    private WebElement dropDownButton = appiumDriver.findElement(AppiumBy.xpath("//*[@text='Select an item...']"));
    private WebElement activeButton = appiumDriver.findElement(AppiumBy.accessibilityId("button-Active"));

    public void clickActiveButton(){
        activeButton.click();
    }

    public void clickDropDownButton(){
        dropDownButton.click();
    }

    public void clickSwitchButton(){
        switchButton.click();
    }

    public void clickSwitchButtonAndCheckResult(){
        String switchTextMessage = switchText.getText();
        if(switchTextMessage.contains("ON")){
            clickSwitchButton();
            switchTextMessage = appiumDriver.findElement(AppiumBy.accessibilityId("switch-text")).getText();
            checkResult(switchTextMessage.contains("OFF"),true);
        }else{
            clickSwitchButton();
            switchTextMessage = appiumDriver.findElement(AppiumBy.accessibilityId("switch-text")).getText();
            checkResult(switchTextMessage.contains("ON"),true);
        }
    }


    public void addInput (String inputText){
        inputField.sendKeys(inputText);
    }

    public String getOutputText(){
        return inputTextResultFiled.getText();
    }


}
