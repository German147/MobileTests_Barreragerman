package mobileTest.andriod;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import mobileTest.common.BikeLightProductBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE,parentClass = BikeLightProductBase.class)
public class BikeLight extends BikeLightProductBase {
    public BikeLight(WebDriver driver) {
        super(driver);
    }


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
