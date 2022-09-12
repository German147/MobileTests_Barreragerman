package mobileTest.andriod;


import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public enum EnumProducts {

    SAUCE_LAB_BACK_PACKS("//android.widget.ImageView[@content-desc=\"Sauce Lab Back Packs\"]"),

    SAUCE_LAB_BOLT_T_SHIRT("//android.widget.ImageView[@content-desc=\"Sauce Lab Bolt T_Shirt\"]"),

    SAUCE_LAB_BIKE_LIGHT("//android.widget.ImageView[@content-desc=\"Sauce Lab Bike Light\"]"),

    SAUCE_LAB_FLEECE_T_SHIRT("//android.widget.ImageView[@content-desc=\"Sauce Lab Fleece T-Shirt\"]"),

    SAUCE_LAB_ONESIE_T_SHIRT("//android.widget.ImageView[@content-desc=\"Sauce Lab Onesie\"]"),

    SAUCE_LAB_TEST_ALL_THE_THINGS_T_SHIRT("//android.widget.ImageView[@content-desc=\"Test.sllTheThings() T-Shirt\"]");

    private String xpaths;

    EnumProducts(String xpaths) {
        this.xpaths = xpaths;
    }

    public String getXpaths() {
        return xpaths;
    }

    public EnumProducts getProduct(EnumProducts products) {
        return products;
    }


}
