@cart @add
Feature: Agregar productos al carrito

  Scenario: Agregar producto al carrito
    Given La aplicación se cargó correctamente
    When El usuario toca el producto numero "1"
    And El usuario agrega el producto al carrito
    Then El carrito muestra el producto agregado
