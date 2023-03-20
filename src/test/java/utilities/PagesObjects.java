package utilities;

import activity.*;

public class PagesObjects {

    private LoginPage loginPage;
    private FormPage formPage;
    private MainPage mainPage;
    private LoginDialogWindow loginDialogWindow;
    private DropDownOptions dropDownOptions;
    private ActiveButtonDialogWindow activeButtonDialogWindow;

    public DropDownOptions dropDownOptions() {
        if (dropDownOptions == null) {
            dropDownOptions = new DropDownOptions();
        }
        return dropDownOptions;
    }
    public LoginDialogWindow loginDialogWindow() {
        if (loginDialogWindow == null) {
            loginDialogWindow = new LoginDialogWindow();
        }
        return loginDialogWindow;
    }

    public MainPage mainPage() {
        if (mainPage == null) {
            mainPage = new MainPage();
        }
        return mainPage;
    }

    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public FormPage formPage(){
        if(formPage == null){
            formPage = new FormPage();
        }
        return formPage;
    }

    public ActiveButtonDialogWindow activeButtonDialogWindow(){
        if(activeButtonDialogWindow == null){
            activeButtonDialogWindow = new ActiveButtonDialogWindow();
        }
        return activeButtonDialogWindow;
    }
}
