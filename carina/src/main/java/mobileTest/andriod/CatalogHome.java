package mobileTest.andriod;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import exceptions.ProductNotFoundException;
import mobileTest.common.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CatalogHomeScreenBase.class)
public class CatalogHome extends CatalogHomeScreenBase {
    private ProductScreen productsClickIt;


    public CatalogHome(WebDriver driver) {
        super(driver);//  //driver.findElementsByXPath("//*[contains(@text,'/')]")
        // xpaths = driver.findElements(By.xpath("(//*[contains(@text,'/')])"));
    }



    @FindBy(id = "com.saucelabs.mydemoapp.android:id/itemTV")
    private ExtendedWebElement catalog;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/closeBt")
    private ExtendedWebElement continueButton;

    @ExtendedFindBy(androidUIAutomator = "(//*[@content-desc])")
    private List<ExtendedWebElement> xpaths;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Lab Back Packs\"]")
    private ExtendedWebElement backPackLab;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Lab Bolt T-Shirt\"]")
    private ExtendedWebElement boltTshirt;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Lab Bike Light\"]")
    private ExtendedWebElement lightBike;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Lab Fleece T-Shirt\"]")
    private ExtendedWebElement fleeceTShirt;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Lab Onesie\"]")
    private ExtendedWebElement onesieTShirt;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Test.sllTheThings() T-Shirt\"]")
    private ExtendedWebElement testTShirt;

    @FindBy(id="com.saucelabs.mydemoapp.android:id/cartIV")
    private ExtendedWebElement goToCart;

    @FindBy(xpath = "//android.widget.ImageView[contains(text(),'Sauce')]")
    private ExtendedWebElement xpathslist;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/productTV")
    private ExtendedWebElement catalogTitle;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/menuIV")
    private ExtendedWebElement menuButton;



    @Override
    public AlertScreenBase clickOnContinueOK() {
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
    public CartScreenBase clickGoToCart() {
        goToCart.click();
        return initPage(getDriver(), CartScreenBase.class);
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
        return catalogTitle.getText();
    }

    @Override
    public String checkSubmitButton() {
        return null;
    }

    @Override
    public ProductDetailsScreenBase productFactory(EnumProducts product) throws ProductNotFoundException {
        return null;
    }


//    public ProductDetailsScreenBase productFactory(EnumProducts product) throws ProductNotFoundException {
//
//        WebElement targetXpath = findXpath(product);
//
//        targetXpath.click();
//
//        switch (product) {
//            case SAUCE_LAB_BACK_PACKS:
//            case SAUCE_LAB_BOLT_T_SHIRT:
//            case SAUCE_LAB_BIKE_LIGHT:
//            case SAUCE_LAB_FLEECE_T_SHIRT:
//            case SAUCE_LAB_ONESIE_T_SHIRT:
//            case SAUCE_LAB_TEST_ALL_THE_THINGS_T_SHIRT:
//                return new ProductDetailsScreen(getDriver()) {
//                };
//            default:
//                return null;
//        }
//    }
//
//    private WebElement findXpath(EnumProducts product) throws ProductNotFoundException {
//
//        Optional<WebElement> targetXpath =  xpaths.stream().filter(x->x.getText().equals(product.getXpaths())).findFirst();
//
//        if (!targetXpath.isPresent()) {
//            throw new ProductNotFoundException("The product " + product + " does not exist");
//        }
//
//        return targetXpath.get();
//    }

    @Override
    public ProductDetailsScreen selectProduct(String product) {

        switch (product) {
            case "BackPacks":
                backPackLab.click();
                break;
            case "BikeLight":
                System.out.println("This product crash the app");
                lightBike.click();
                break;
            case "BoltTShirt":
                boltTshirt.click();
                break;
            case "FleeceTShirt":
                fleeceTShirt.click();
                break;
            case "OnesieTShirt":
                onesieTShirt.click();
                break;
            case "AllThingsTShirt":
                testTShirt.click();
                break;
            default:
        }
        return new ProductDetailsScreen(getDriver());

    }


}



