@checkout
Feature: Completar una compra

  Scenario: El usuario completa una compra con los valores por defecto
    Given La aplicación se cargó correctamente
    And La pantalla Home se muestra
    When El usuario toca el producto numero "1"
    And El usuario agrega el producto al carrito
    And El usuario abre el carrito
    And El usuario continua al checkout
    And El usuario completa la compra con los datos por defecto
    Then La pantalla de exito del checkout se muestra

