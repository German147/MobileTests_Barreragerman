package mobileTest.andriod;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import exceptions.ProductNotFoundException;
import mobileTest.common.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.apache.logging.log4j.ThreadContext.isEmpty;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CatalogHomeScreenBase.class)
public class CatalogHome extends CatalogHomeScreenBase implements IMobileUtils {


    @FindBy(id = "com.saucelabs.mydemoapp.android:id/menuIV")
    private ExtendedWebElement menuButton;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/itemTV")
    private ExtendedWebElement catalog;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/closeBt")
    private ExtendedWebElement continueButton;

    private final List<WebElement> xpaths;

    public CatalogHome(WebDriver driver) {
        super(driver);//  //driver.findElementsByXPath("//*[contains(@text,'/')]")
        xpaths = driver.findElements(By.xpath("//android.widget.ImageView[@content-desc=\"Sauce Lab\"]"));
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


    public ProductDetailsScreenBase productFactory(EnumProducts product) throws ProductNotFoundException {

        WebElement targetXpath = findXpath(product);

        targetXpath.click();

        switch (product) {
            case SAUCE_LAB_BACK_PACKS:
            case SAUCE_LAB_BOLT_T_SHIRT:
            case SAUCE_LAB_BIKE_LIGHT:
            case SAUCE_LAB_FLEECE_T_SHIRT:
            case SAUCE_LAB_ONESIE_T_SHIRT:
            case SAUCE_LAB_TEST_ALL_THE_THINGS_T_SHIRT:
                return new ProductDetailsScreen(getDriver()) {
                };
            default:
                return null;
        }
    }

    private WebElement findXpath(EnumProducts product) throws ProductNotFoundException {

        Optional<WebElement> targetXpath =  xpaths.stream().filter(x->x.getText().equals(product.getXpaths())).findFirst();

        if (!targetXpath.isPresent()) {
            throw new ProductNotFoundException("The product " + product + " does not exist");
        }

        return targetXpath.get();
    }

}
