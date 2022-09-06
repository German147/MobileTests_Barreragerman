package mobileTest.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import mobileTest.common.CartScreenBase;
import mobileTest.common.NoItemScreenBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CartScreenBase.class)
public class iosCartScreen extends CartScreenBase {
    public iosCartScreen(WebDriver driver) {
        super(driver);
    }

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"Remove Item\"`]")
    private ExtendedWebElement removeItem;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"3 Items\"`]")
    private ExtendedWebElement numberOfItem;

    @Override
    public NoItemScreenBase clickOnRemove() {
        removeItem.click();
        return initPage(getDriver(), NoItemScreenBase.class);
    }

    @Override
    public void clickToCheckOut() {
    }

    @Override
    public String getNumberOfItem() {
        return numberOfItem.getText();
    }


}
