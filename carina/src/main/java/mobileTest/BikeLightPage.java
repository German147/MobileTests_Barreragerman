package mobileTest;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = AbstractUIObject.class)
public class BikeLightPage extends AbstractUIObject {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"Sauce Lab Bike Light\"`]")
    private ExtendedWebElement productTitle;
    public BikeLightPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getName() {
        return productTitle.getName();
    }
}
