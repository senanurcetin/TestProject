package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;


public class HomePage extends BasePage {
    SearchBox searchBox;
    By logPageLocator = By.className("user-login");
    By loginPageLocator = By.className("dropdown-toggle");
    By cartCountLocator = By.id("spanCart");



    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }
    public SearchBox searchBox(){
        return this.searchBox;
    }

    public void goToLogin() {
        click(loginPageLocator);
    }

    public boolean isOnLoginPage() {
        return isDisplayed(logPageLocator);
    }

    public boolean isProductCountUp() {
        return getCartCount() > 0 ;
    }

    private int getCartCount(){
       String count = find(cartCountLocator).getText();
       return Integer.parseInt(count);
    }
}
