@search
Feature: Buscar productos haciendo scroll en la pantalla principal

  Scenario: El usuario encuentra un producto haciendo scroll hacia abajo
    Given La pantalla Home se muestra
    When El usuario hace scroll hasta que el producto "Sauce Labs Backpack (violet)" sea visible
    Then El producto "Sauce Labs Backpack (violet)" se muestra en pantalla
