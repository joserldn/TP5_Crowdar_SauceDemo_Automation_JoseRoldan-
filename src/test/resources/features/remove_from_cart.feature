@cart @remove
Feature: Eliminar productos del carrito

  Scenario: El usuario elimina un producto del carrito
    Given La aplicación se cargó correctamente
    And La pantalla Home se muestra
    And El usuario toca el producto numero "1"
    And El usuario agrega el producto al carrito
    When El usuario abre el carrito
    And El usuario elimina "Sauce Labs Backpack" del carrito
    Then El carrito debe estar vacio
