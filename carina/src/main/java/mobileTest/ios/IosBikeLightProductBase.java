package mobileTest.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import mobileTest.common.BikeLightProductBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = BikeLightProductBase.class)
public class IosBikeLightProductBase extends BikeLightProductBase {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"Sauce Lab Bike Light\"`]")
    private ExtendedWebElement productTitle;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"$ 9.99\"`]")
    private ExtendedWebElement productPrice;

    public IosBikeLightProductBase(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getProductTitle() {
        return productTitle.getText();
    }

    @Override
    public String getProductPrice() {
        return productPrice.getText();
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
        return null;
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

    }

    @Override
    public void clickOnProductMinusButton() {

    }
}
