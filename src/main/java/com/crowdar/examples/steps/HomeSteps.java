package com.crowdar.examples.steps;

import com.crowdar.examples.services.HomeService;
import io.cucumber.java.en.*;

public class HomeSteps {

    @Given("La aplicación se cargó correctamente")
    public void cargarCorrectamente() {
        HomeService.verificarHomeCargada();
    }

    @Given("La pantalla Home se muestra")
    public void pantallaHome() {
        HomeService.verificarHomeCargada();
    }

    @Then("El producto {string} se muestra en pantalla")
    public void productoVisible(String producto) {
        HomeService.verificarProductoVisible(producto);
    }

    @When("El usuario toca el producto numero {string}")
    public void elUsuarioTocaElProductoNumero(String indexStr) {
        int index = Integer.parseInt(indexStr);
        HomeService.tapProductByIndex(index);
    }
}
