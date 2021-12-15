package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class CartPage extends BasePage {

    By addQuantityLocator = By.className("oq-up plus");
    By QuantityLocator = By.className("item-quantity-input ignored");
    By deleteProductsLocator = By.className("fa fa-trash-o");
    By confirmDeleteLocator = By.className("cart-empty-title");
    By pricesLocator = By.className("rd-cart-item-price mb-15");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkIfProductPrice(String price) {
        int lastPrice = calculatePrice(price);
        return getCartPrice() == lastPrice;
    }

    public void increaseQuantity() {
        click(addQuantityLocator);
    }

    public boolean checkIfQuantity() {

        return getQuantityCount() > 0;
    }

    public void deleteProducts() {
        click(deleteProductsLocator);
    }

    public boolean checkIfDelete() {
        return isDisplayed(confirmDeleteLocator);
    }

    private int getQuantityCount(){
        String count = find(QuantityLocator).getText();
        return Integer.parseInt(count);
    }

    private int getCartPrice(){
        String count = find(pricesLocator).getText();
        return Integer.parseInt(count);
    }

    private int calculatePrice(String price){
        return Integer.parseInt(price);
    }

}
