import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import pages.*;

public class Test_For_Shopping extends BaseTest{

    HomePage homePage;
    LoginPage loginPage;
    FirstProductsPage firstProductsPage;
    SecondProductPage secondProductPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;

    @Test
    @Order(1)
    public void login_button(){
        homePage = new HomePage(driver);
        homePage.goToLogin();
        Assertions.assertTrue(homePage.isOnLoginPage(), "Not on Login page");

    }
    @Test
    @Order(2)
    public void login(){
        loginPage = new LoginPage(driver);
        loginPage.loginBox().login("senanurcetin96@gmail.com", "senna59");
        Assertions.assertTrue(loginPage.isOnHomePage(), "Login Failed!");
    }
    @Test
    @Order(3)
    public void search_products(){
        firstProductsPage = new FirstProductsPage(driver);
        homePage.searchBox().search("Pantolon");
        Assertions.assertTrue(firstProductsPage.isOnFirstProductsPage(), "Not on first products page!");
    }
    @Test
    @Order(4)
    public void click_more_products(){
        secondProductPage = new SecondProductPage(driver);
        firstProductsPage.goToSecondProductsPage();
        Assertions.assertTrue(secondProductPage.isOnSecondProductPage(), "Not on second product page!");

    }

    @Test
    @Order(5)
    public void select_products(){
        secondProductPage = new SecondProductPage(driver);
        productDetailPage = new ProductDetailPage(driver);
        secondProductPage.selectProduct(1);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(), "Not on products detail page!");

    }
    @Test
    @Order(6)
    public void add_product_to_cart(){
        productDetailPage.addToCart();
        Assertions.assertTrue(homePage.isProductCountUp(),"Product count did not increase!");

    }
    @Test
    @Order(7)
    public void compare_prices(){
        cartPage = new CartPage(driver);
        productDetailPage.goToCart();
        String store = productDetailPage.getPrice();
        Assertions.assertTrue(cartPage.checkIfProductPrice(store),"Product price does not match!");
    }
    @Test
    @Order(8)
    public void Increase_quantity(){
        cartPage.increaseQuantity();
        Assertions.assertTrue(cartPage.checkIfQuantity(),"The number of products could not be increased!");

    }
    @Test
    @Order(9)
    public void delete_products(){
        cartPage.deleteProducts();
        Assertions.assertTrue(cartPage.checkIfDelete(), "Products could not be delete!");

    }
}
