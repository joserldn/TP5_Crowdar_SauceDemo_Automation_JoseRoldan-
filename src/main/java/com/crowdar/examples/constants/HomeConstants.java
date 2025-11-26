package com.crowdar.examples.constants;

public class HomeConstants {

    // Título principal que aparece al cargar la Home
    public static final String HEADER_TITLE =
            "id:com.saucelabs.mydemoapp.android:id/productTV";

    // Plantilla del título del producto (texto del item)
    public static final String PRODUCT_TITLE =
            "xpath://android.widget.TextView[@text='%s']";

    public static final String ADD_TO_CART_BUTTON = "id:com.saucelabs.mydemoapp.android:id/cartBt";

    // Botón del carrito en la barra superior
    public static final String CART_BUTTON =
            "id:com.saucelabs.mydemoapp.android:id/cartIV";

    // Imagen del producto (en la Home)
    public static final String PRODUCT_IMAGE = "xpath:(//android.widget.ImageView[@content-desc=\"Product Image\"])[%s]";

    public static final String PRODUCT_DETAIL_TITLE = "id:com.saucelabs.mydemoapp.android:id/productTV";

}
