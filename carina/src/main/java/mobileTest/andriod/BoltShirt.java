package mobileTest.andriod;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import mobileTest.common.BoltShirtBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = BoltShirtBase.class)
public class BoltShirt extends BoltShirtBase {
    public BoltShirt(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "android.widget.TextView")
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
