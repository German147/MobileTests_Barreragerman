package mobileTest.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import mobileTest.common.BoltShirtBase;
import mobileTest.common.ProductsBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = BoltShirtBase.class)
public class IosBoltTShirt extends BoltShirtBase {

    public IosBoltTShirt(WebDriver driver) {
        super(driver);
    }

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"Sauce Lab Bolt T-Shirt\"`]")
    private ExtendedWebElement tShirtTitle;

    @Override
    public String getProductTitle() {
        return tShirtTitle.getText();
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
