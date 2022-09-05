package mobileTest.andriod;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import mobileTest.common.*;
import mobileTest.common.BackPackProductBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CatalogHomeScreenBase.class)
public class CatalogHomeScreen extends CatalogHomeScreenBase {
    public CatalogHomeScreen(WebDriver driver) {
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

    @Override
    public BackPackProductBase clickOnBackPack() {
        backPack.click();
        return initPage(getDriver(), BackPackProductBase.class);
    }

    @Override
    public BikeLight clickOnBikeLight() {
        lightBike.click();
        return initPage(getDriver(),BikeLight.class);
    }

    @Override
    public BoltShirtBase clickOnBoltTShirt() {
       boltTshirt.click();
        return initPage(getDriver(),BoltShirtBase.class);
    }

    @Override
    public FleeceTShirtBase clickOnFleeceTShirt() {
      fleeceTShirt.click();
        return initPage(getDriver(), FleeceTShirtBase.class);
    }

    @Override
    public ProductsBase clickOnLabOnesie() {
        return null;
    }

    @Override
    public ProductsBase clickOnTestAllTShirt() {
        return null;
    }

    @Override
    public ProductsBase clickOnSubmitting() {
        return null;
    }

    @Override
    public void clickAddToCart() {

    }

    @Override
    public MenuScreenBase clickOnMenu() {
        menuButton.click();
        return initPage(getDriver(), MenuScreenBase.class);
    }

    @Override
    public CartScreen clickGoToCart() {
        return null;
    }

    @Override
    public CatalogHomeScreenBase clickOnCatalog() {
        catalog.click();
        return initPage(getDriver(), CatalogHomeScreenBase.class);
    }

    @Override
    public void clickOnSortingItem() {

    }

    @Override
    public void clickOnOptionMenu() {

    }
}
