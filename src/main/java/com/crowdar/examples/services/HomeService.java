package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomeService {

    public static void verificarHomeCargada() {
        MobileActionManager.waitVisibility(HomeConstants.HEADER_TITLE);
    }

    public static void verificarProductoVisible(String productName) {
        String locator = String.format(HomeConstants.PRODUCT_TITLE, productName);
        MobileActionManager.waitVisibility(locator);
    }

    public static void tapProduct(int index) {
        String locator = String.format(HomeConstants.PRODUCT_IMAGE, index);
        MobileActionManager.click(locator);
    }

    public static void agregarProductoAlCarrito() {
        MobileActionManager.waitVisibility(HomeConstants.ADD_TO_CART_BUTTON);
        MobileActionManager.click(HomeConstants.ADD_TO_CART_BUTTON);
    }

    public static void openCart() {
        MobileActionManager.click(HomeConstants.CART_BUTTON);
    }

    public static void tapProductByIndex(int index) {
        List<WebElement> products = MobileActionManager.getElements("xpath://*[@content-desc='Product Image']");

        if (products == null || products.isEmpty()) {
            throw new RuntimeException("No se encontraron productos.");
        }

        if (index < 1 || index > products.size()) {
            throw new RuntimeException("Índice fuera de rango: " + index + " (total: " + products.size() + ")");
        }

        products.get(index - 1).click();

        MobileActionManager.waitVisibility(HomeConstants.PRODUCT_DETAIL_TITLE);
    }
}
