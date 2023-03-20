package firstTry;

import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.TestBase;

public class FirstTest extends TestBase {


    @Test
    public void loginFunction(){

        String userName = ConfigurationReader.getProperty("username");
        String passWord = ConfigurationReader.getProperty("password");
        pagesObjects.mainPage().clickLoginMenu();
        pagesObjects.loginPage().login(userName,passWord);
        String actualMessage = pagesObjects.loginDialogWindow().getActualMessage();
        String expectedMessage = "You are logged in!";
        pagesObjects.loginPage().compareResults(actualMessage,expectedMessage);
        pagesObjects.loginDialogWindow().clickOkButton();
        pagesObjects.mainPage().clickHomeButton();

    }

    @Test
    public void formComponents(){

        pagesObjects.mainPage().clickFormsButton();
        pagesObjects.mainPage().scrollDown();
        String expectedInputText = "Mobile testing is fun!";
        pagesObjects.formPage().addInput(expectedInputText);
        String actualOutputText = pagesObjects.formPage().getOutputText();
        pagesObjects.formPage().compareResults(actualOutputText,expectedInputText);
        pagesObjects.formPage().clickSwitchButtonAndCheckResult();
        pagesObjects.formPage().clickDropDownButton();
        String expectedSelectedOption = "Appium is awesome";
        pagesObjects.dropDownOptions().chooseDropDownOption(expectedSelectedOption);
        String actualSelectedOption = pagesObjects.dropDownOptions().getSelectedOption(expectedSelectedOption);
        pagesObjects.formPage().compareResults(actualSelectedOption,expectedSelectedOption);
        pagesObjects.formPage().clickActiveButton();
        String expectedActiveButtonMessage = "This button is active";
        String actualActiveButtonMessage = pagesObjects.activeButtonDialogWindow().getActiveButtonMessage();
        pagesObjects.formPage().compareResults(actualActiveButtonMessage,expectedActiveButtonMessage);
        pagesObjects.activeButtonDialogWindow().clickOkButton();
        pagesObjects.mainPage().clickHomeButton();
    }


}
