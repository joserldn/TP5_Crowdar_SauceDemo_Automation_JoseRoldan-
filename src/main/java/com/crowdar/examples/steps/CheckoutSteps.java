package com.crowdar.examples.steps;

import com.crowdar.examples.services.HomeService;
import com.crowdar.examples.services.CartService;
import com.crowdar.examples.services.CheckoutService;
import io.cucumber.java.en.*;

public class CheckoutSteps {

    @And("El usuario agrega el producto al carrito")
    public void agregarAlCarrito() {
        HomeService.agregarProductoAlCarrito();
    }

    @And("El usuario continua al checkout")
    public void continuarCheckout() {
        CartService.proceedToCheckout();
    }

    @And("El usuario completa la compra con los datos por defecto")
    public void completarDatos() {
        CheckoutService.completarCheckoutDatosPorDefecto();
    }

    @Then("La pantalla de exito del checkout se muestra")
    public void pantallaExito() {
        CheckoutService.verificarCheckoutExitoso();
    }

    @Then("El carrito muestra el producto agregado")
    public void carritoMuestraProductoAgregado() {
        CartService.verifyProductInCart("Sauce Labs Backpack");
    }
}
