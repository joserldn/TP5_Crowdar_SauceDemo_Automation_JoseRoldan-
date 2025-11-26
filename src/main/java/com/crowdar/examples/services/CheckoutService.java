package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.CheckoutConstants;

public class CheckoutService {

    public static void completarCheckoutDatosPorDefecto() {

        // --- LOGIN ---
        MobileActionManager.setInput(CheckoutConstants.LOGIN_USERNAME, "bod@example.com");
        MobileActionManager.setInput(CheckoutConstants.LOGIN_PASSWORD, "10203040");
        MobileActionManager.click(CheckoutConstants.LOGIN_BUTTON);

        // --- SHIPPING ---
        MobileActionManager.setInput(CheckoutConstants.FULL_NAME, "Rebecca Winter");
        MobileActionManager.setInput(CheckoutConstants.ADDRESS_1, "Manderley 112");
        MobileActionManager.setInput(CheckoutConstants.ADDRESS_2, "Entrance 1");
        MobileActionManager.setInput(CheckoutConstants.CITY, "Truro");
        MobileActionManager.setInput(CheckoutConstants.ZIP_CODE, "89750");
        MobileActionManager.setInput(CheckoutConstants.COUNTRY, "United Kingdom");

        MobileActionManager.click(CheckoutConstants.TO_PAYMENT_BUTTON);

        // --- PAYMENT ---
        MobileActionManager.setInput(CheckoutConstants.CARD_FULLNAME, "Rebecca Winter");
        MobileActionManager.setInput(CheckoutConstants.CARD_NUMBER, "3258 1256 7568 7891");
        MobileActionManager.setInput(CheckoutConstants.CARD_EXP_DATE, "03/25");
        MobileActionManager.setInput(CheckoutConstants.CARD_SECURITY_CODE, "123");

        MobileActionManager.click(CheckoutConstants.REVIEW_ORDER_BUTTON);

        // --- REVIEW ---
        MobileActionManager.click(CheckoutConstants.PLACE_ORDER_BUTTON);
    }

    public static void verificarCheckoutExitoso() {
        MobileActionManager.waitVisibility(CheckoutConstants.SUCCESS_TITLE);
    }
}
