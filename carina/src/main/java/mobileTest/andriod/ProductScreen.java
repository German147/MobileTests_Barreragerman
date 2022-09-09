package mobileTest.andriod;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import mobileTest.common.ProductDetailsScreenBase;
import mobileTest.common.ProductScreenBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE,parentClass = ProductScreen.class)
public class ProductScreen extends ProductScreenBase {
    public ProductScreen(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Lab Back Packs\"]")
    private ExtendedWebElement backPack;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Lab Bolt T-Shirt\"]")
    private ExtendedWebElement boltTshirt;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/productIV")
    private ExtendedWebElement lightBike;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Lab Fleece T-Shirt\"]")
    private ExtendedWebElement fleeceTShirt;

    @Override
    public ProductDetailsScreenBase clickOnBackPack() {
        return null;
    }

    @Override
    public ProductDetailsScreenBase clickOnBikeLight() {
        return null;
    }

    @Override
    public ProductDetailsScreenBase clickOnBoltTShirt() {
        return null;
    }

    @Override
    public ProductDetailsScreenBase clickOnFleeceTShirt() {
        return null;
    }

    @Override
    public ProductDetailsScreenBase clickOnOnesieTShirt() {
        return null;
    }

    @Override
    public ProductDetailsScreenBase clickOnTestTShirt() {
        return null;
    }
}
