package steps;

import io.cucumber.java.en.And;
import ui.pages.MainPage;
import ui.pages.OrderPage;

/**
 * @author Jean Carlo Rodriguez
 */

public class Main {

    MainPage mainPage;
    OrderPage orderPage;

    public Main() {
        mainPage = new MainPage();
    }

    @And("go to checkout")
    public void goToCheckout() {
        orderPage = mainPage.clickOnCheckoutShowCart();
    }
}
