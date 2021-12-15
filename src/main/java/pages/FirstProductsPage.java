package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class FirstProductsPage extends BasePage {

    By pageLocator = By.className("quick-filters__heading-text");
    By forSecondPageLocator = By.className("paginator__button");

    public FirstProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnFirstProductsPage() {
        return isDisplayed(pageLocator);
    }

    public void goToSecondProductsPage(){
        click(forSecondPageLocator);

    }
}
