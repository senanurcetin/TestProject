package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.util.List;

public class SecondProductPage extends BasePage {

    By secondPageLocator = By.className("paginator__info-text-viewed-products");
    By selectProductLocator = By.className("product-image__image");

    public SecondProductPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnSecondProductPage() {
        return getPageNumber()==192;
    }


    public void selectProduct(int i) {
        getAllProducts().get(i).click();
    }
    private List<WebElement> getAllProducts(){
        return findAll(selectProductLocator);
    }

    private int getPageNumber(){
        String count = find(secondPageLocator).getText();
        return Integer.parseInt(count);
    }
}
