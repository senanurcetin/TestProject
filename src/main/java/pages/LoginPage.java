package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.LoginBox;


public class LoginPage extends BasePage {

    LoginBox loginBox;
    By homePageLocator = By.className("main-nav");

    public LoginPage(WebDriver driver) {
        super(driver);

        loginBox = new LoginBox(driver);
    }

    public LoginBox loginBox() {
        return this.loginBox;
    }


    public boolean isOnHomePage() {
        return isDisplayed(homePageLocator);
    }
}
