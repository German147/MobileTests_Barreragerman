package mobileTest.andriod;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import mobileTest.common.AlertScreenBase;
import mobileTest.common.MenuScreenBase;
import mobileTest.common.ProductDetailsScreenBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ProductDetailsScreenBase.class)
public class ProductDetailsScreen extends ProductDetailsScreenBase {
    public ProductDetailsScreen(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "com.saucelabs.mydemoapp.android:id/productIV")
    private ExtendedWebElement backPack;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/productTV")
    private ExtendedWebElement getBackPackText;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/start2IV")
    private ExtendedWebElement submitButton;
    @FindBy(id = "com.saucelabs.mydemoapp.android:id/noTV")
    private ExtendedWebElement numberOfItems;
    @FindBy(id = "com.saucelabs.mydemoapp.android:id/plusIV")
    private ExtendedWebElement plusButton;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/descTV")
    private ExtendedWebElement minusBUtton;

    @FindBy(className = "android.widget.TextView")
    private ExtendedWebElement tShirtTitle;

    @FindBy(className = "android.widget.TextView")
    private ExtendedWebElement fleeceTitle;


    @Override
    public String getProductTitle() {
        return null;
    }

    @Override
    public String getProductPrice() {
        return null;
    }

    @Override
    public void clickOnRadiobutton() {

    }

    @Override
    public String getValueRadioButton() {
        return null;
    }

    @Override
    public String getProductAmount() {
        return numberOfItems.getText();
    }

    @Override
    public void clickSubmittingMenu() {

    }

    @Override
    public String getProductSelectedStar() {
        return null;
    }

    @Override
    public void clickOnProductPlusButton() {
        plusButton.click();    }

    @Override
    public void clickOnProductMinusButton() {

    }

    @Override
    public void clickAddToCartButton() {

    }

    @Override
    public AlertScreenBase clickOnSubmitStar() {
        return null;
    }

    @Override
    public void swipeUp() {
        swipe(plusButton);
    }
}
