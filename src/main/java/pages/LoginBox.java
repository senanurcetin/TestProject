package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class LoginBox extends BasePage {

    By emailBoxLocator = By.id("LoginEmail");
    By passwordBoxLocator = By.id("Password");
    By enterButtonLocator = By.id("loginLink");

    public LoginBox(WebDriver driver) {
        super(driver);
    }
    public void login(String email, String  password) {
        type(emailBoxLocator , email);
        type(passwordBoxLocator , password);
        click(enterButtonLocator);
    }
}
