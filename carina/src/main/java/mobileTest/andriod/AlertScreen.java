package mobileTest.andriod;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import mobileTest.common.AlertScreenBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE,parentClass = AlertScreenBase.class)
public class AlertScreen extends AlertScreenBase {
    public AlertScreen(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/sortTV")
    private ExtendedWebElement alertText;
    @Override
    public String getAlertText() {
        return alertText.getText();
    }


}
