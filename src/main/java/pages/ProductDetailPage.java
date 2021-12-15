package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class ProductDetailPage extends BasePage {

    By detailPageLocator = By.id("pd_add_to_cart");
    By cartPageLocator = By.className("header-cart");
    By size = By.className("option-size");
    By height = By.id("option-height");
    By priceLocator = By.className("price");


    public ProductDetailPage(WebDriver driver) {

        super(driver);
    }
    public void addToCart() {
        click(size);
        click(height);
        click(detailPageLocator);
    }

    public void goToCart() {

        click(cartPageLocator);
    }

    public boolean isOnProductDetailPage() {
        return isDisplayed(detailPageLocator);
    }


    public String getPrice() {
        String store = find(priceLocator).getText();
        return store;
    }
}
