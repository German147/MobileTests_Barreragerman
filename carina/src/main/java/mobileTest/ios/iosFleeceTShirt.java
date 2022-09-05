package mobileTest.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import mobileTest.common.FleeceTShirtBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE,parentClass = FleeceTShirtBase.class)
public class iosFleeceTShirt extends FleeceTShirtBase {
    public iosFleeceTShirt(WebDriver driver) {
        super(driver);
    }

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"Sauce Lab Fleece T-Shirt\"`]")
    private ExtendedWebElement fleeceTitle;

    @Override
    public String getProductTitle() {
        return fleeceTitle.getText();
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
