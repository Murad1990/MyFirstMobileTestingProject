package activity;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import utilities.BasePage;

public class DropDownOptions extends BasePage {




    public void chooseDropDownOption(String dropDownOption){
        WebElement selectedOption = appiumDriver.findElement(AppiumBy.xpath("//*[@text='"+dropDownOption+"']"));
        selectedOption.click();
    }

    public String getSelectedOption(String dropDownOption){
        WebElement actualSelectedDropDownOption = appiumDriver.findElement(AppiumBy.xpath("//*[@text='"+dropDownOption+"']"));
        return actualSelectedDropDownOption.getText();
    }


}
