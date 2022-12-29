package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class BuyProduct {
    private int stock;

    @Given("{int} products in stock")
    public void products_in_stock(Integer quantity) {
        stock = quantity;
    }

    @When("{int} products are bought")
    public void productsAreBought(int quantity) {
        stock -= quantity;
    }

    @Then("{int} products remain in stock")
    public void productsRemainInStock(int quantity) {
        assertEquals(quantity, stock);
    }
}
