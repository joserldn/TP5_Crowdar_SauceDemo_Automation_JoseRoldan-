package com.crowdar.examples.steps;

import com.crowdar.examples.services.CartService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class CartSteps {

    @Then("The cart must contain {string}")
    public void cartContains(String product) {
        CartService.verifyProductInCart(product);
    }

    @When("The user removes {string} from the cart")
    public void removeProduct(String product) {
        CartService.removeProduct(product);
    }

    @Then("The cart must be empty")
    public void cartEmpty() {
        CartService.verifyCartEmpty();
    }

    @When("The user proceeds to checkout")
    public void proceedToCheckout() {
        CartService.proceedToCheckout();
    }

    @When("El usuario abre el carrito")
    public void abrirCarrito() {
        CartService.openCart();
    }

    @And("El usuario elimina {string} del carrito")
    public void eliminarProducto(String productName) {
        CartService.removeProduct(productName);
    }

    @Then("El carrito debe estar vacio")
    public void carritoVacio() {
        CartService.verifyCartEmpty();
    }

}
