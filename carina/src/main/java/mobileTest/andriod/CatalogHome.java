package mobileTest.andriod;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import mobileTest.common.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CatalogHomeScreenBase.class)
public class CatalogHome extends CatalogHomeScreenBase {
    public CatalogHome(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Lab Back Packs\"]")
    private ExtendedWebElement backPack;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/menuIV")
    private ExtendedWebElement menuButton;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/itemTV")
    private ExtendedWebElement catalog;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Lab Bolt T-Shirt\"]")
    private ExtendedWebElement boltTshirt;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/productIV")
    private ExtendedWebElement lightBike;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Lab Fleece T-Shirt\"]")
    private ExtendedWebElement fleeceTShirt;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/closeBt")
    private ExtendedWebElement continueButton;

    @Override
    public AlertScreenBase clickOnContinueOK() {
        return null;
    }

    @Override
    public void clickAddToCart() {

    }

    @Override
    public MenuScreenBase clickOnMenu() {
        return null;
    }

    @Override
    public CartScreenBase clickGoToCart() {
        return null;
    }

    @Override
    public CatalogHomeScreenBase clickOnCatalog() {
        return null;
    }

    @Override
    public void clickOnSortingItem() {

    }

    @Override
    public void clickOnOptionMenu() {

    }

    @Override
    public String getCatalogTitle() {
        return null;
    }

    @Override
    public String checkSubmitButton() {
        return null;
    }


}
