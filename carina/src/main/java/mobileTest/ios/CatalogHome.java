package mobileTest.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import mobileTest.common.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import static com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type.IOS_PHONE;

@DeviceType(pageType = IOS_PHONE, parentClass = CatalogHomeScreenBase.class)
public class CatalogHome extends CatalogHomeScreenBase {

    private static final String THIS_METHOD_IS_DEFINED_ONLY_IN_ANDROID = "This method is not yet implemented for iOS";

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`name == \"Catalog-tab-item\"`]")
    private ExtendedWebElement catalog;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"ProductItem\"`][1]")
    private ExtendedWebElement backPack;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"Button\"`]")
    private ExtendedWebElement sortingButton;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"ProductItem\"`][2]")
    private ExtendedWebElement bikeLight;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`name == \"More-tab-item\"`]")
    private ExtendedWebElement menuOption;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`name == \"Cart-tab-item\"`]")
    private ExtendedWebElement goToCart;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"ProductItem\"`][3]")
    private ExtendedWebElement tShirtBolt;

    @FindBy(xpath = "(//XCUIElementTypeOther[@name=\"ProductItem\"])[4]")
    private ExtendedWebElement fleeceTShirt;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"Products\"`]")
    private ExtendedWebElement catalogTitle;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"StarUnSelected Icons\"`][1]")
    private ExtendedWebElement submitButton;

    public CatalogHome(WebDriver driver) {
        super(driver);
    }

    @Override
    public BackPackProductBase clickOnBackPack() {
        backPack.click();
        return initPage(getDriver(), BackPackProductBase.class);
    }

    @Override
    public BikeLightProductBase clickOnBikeLight() {
        bikeLight.click();
        return initPage(getDriver(), BikeLightProductBase.class);
    }

    @Override
    public BoltShirtBase clickOnBoltTShirt() {
        tShirtBolt.click();
        return initPage(getDriver(), BoltShirtBase.class);
    }

    @Override
    public FleeceTShirtBase clickOnFleeceTShirt() {
        fleeceTShirt.click();
        return initPage(getDriver(),FleeceTShirtBase.class);
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
    public AlertScreenBase clickOnContinueOK() {
        return null;
    }

    @Override
    public void clickAddToCart() {

    }

    @Override
    public MenuScreenBase clickOnMenu() {
        menuOption.click();
        return initPage(getDriver(), MenuScreenBase.class);
    }

    @Override
    public CartScreenBase clickGoToCart() {
        goToCart.click();
        return initPage(getDriver(), CartScreenBase.class);
    }

    @Override
    public CatalogHomeScreenBase clickOnCatalog() {
        catalog.click();
        return initPage(getDriver(), CatalogHomeScreenBase.class);
    }

    @Override
    public void clickOnSortingItem() {
        sortingButton.click();
    }

    @Override
    public void clickOnOptionMenu() {
        throw new UnsupportedOperationException(THIS_METHOD_IS_DEFINED_ONLY_IN_ANDROID);
    }

    @Override
    public String getCatalogTitle() {
        return catalogTitle.getText();
    }

    @Override
    public String checkSubmitButton() {
        return submitButton.getText();
    }


}
