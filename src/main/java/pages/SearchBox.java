package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class SearchBox extends BasePage {

    By searchBoxLocator = By.id("search_input");
    By submitButtonLocator = By.className("searchButton");
    By searchIcon = By.className("searchIcon");

    public SearchBox(WebDriver driver) {
        super(driver);
    }


    public void search(String text) {
        click(searchIcon);
        type(searchBoxLocator , text);
        click(submitButtonLocator);
    }
}
