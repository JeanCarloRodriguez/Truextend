package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import ui.pages.OrderPage;

/**
 * @author Jean Carlo Rodriguez
 */

public class Order {

    OrderPage orderPage;

    public Order() {
        orderPage = new OrderPage();
    }

    @Then("the {string} item it's available")
    public void theItemShouldByAvailable(String itemName) {
        Assert.assertTrue(itemName + "should be in stock", orderPage.isItemOnStock(itemName));
    }

    @When("I remove {string} item from shopping cart")
    public void iRemoveItemFromShoppingCart(String itemName) {
        orderPage.removeItemFromCart(itemName);
    }

    @Then("{string} item should  be deleted from shopping cart")
    public void itemShouldBeDeletedFromShoppingCart(String itemName) {
        Assert.assertTrue("Item should by deleted", orderPage.isItemDeletedFromShoppingCart(itemName));
    }

    @And("the total amount to pay is {string}")
    public void theTotalAmountToPayIs(String totalAmount) {
        Assert.assertEquals(totalAmount, orderPage.getTotalPrice());
    }
}
