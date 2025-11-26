package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.CartConstants;

import java.util.List;
import org.openqa.selenium.WebElement;

public class CartService {

    public static void verifyProductInCart(String productName) {
        List<WebElement> items = MobileActionManager.getElements("id:com.saucelabs.mydemoapp.android:id/titleTV");

        for (WebElement e : items) {
            if (e.getText().equals(productName)) {
                return;
            }
        }
        throw new RuntimeException("El producto NO está en el carrito: " + productName);
    }


    public static void removeProduct(String productName) {
        // No hace falta buscar por nombre: la app solo tiene un botón REMOVE por producto
        MobileActionManager.waitVisibility(CartConstants.REMOVE_BUTTON);
        MobileActionManager.click(CartConstants.REMOVE_BUTTON);
    }

    public static void verifyCartEmpty() {
        // Si el botón REMOVE no está visible, significa carrito vacío
        boolean stillVisible = MobileActionManager.isVisible(CartConstants.REMOVE_BUTTON);

        if (stillVisible) {
            throw new RuntimeException("El carrito NO está vacío.");
        }
    }

    public static void proceedToCheckout() {
        MobileActionManager.waitVisibility(CartConstants.CHECKOUT_BUTTON);
        MobileActionManager.click(CartConstants.CHECKOUT_BUTTON);
    }

    public static void openCart() {
        MobileActionManager.click(CartConstants.CART_ICON);
    }

}
