package mobileTest;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = AbstractUIObject.class)
public class BackPackPage extends AbstractUIObject {

  @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"Catalog\"`]")
    private ExtendedWebElement backToCatalog;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"Sauce Lab Back Packs\"`]")
    private ExtendedWebElement productTitle;

    public BackPackPage(WebDriver driver) {
        super(driver);
    }

    public HomePageGer clickOnBackToCatalog() {
        backToCatalog.click();
        return new HomePageGer(getDriver());
    }

    public String getBackPackTitle() {
        return productTitle.getText();
    }
}
