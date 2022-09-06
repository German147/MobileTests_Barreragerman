package mobileTest.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import mobileTest.common.CatalogHomeScreenBase;
import mobileTest.common.NoItemScreenBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = NoItemScreenBase.class)
public class iosNoItemScreenBase extends NoItemScreenBase {
    public iosNoItemScreenBase(WebDriver driver) {
        super(driver);
    }

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"Go Shopping\"`]")
    private ExtendedWebElement goShoppingButton;

//    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"No Items\"`]")
//    private ExtendedWebElement noItemTitle;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"No Items\"]")
    private ExtendedWebElement itemTitle;
    @Override
    public CatalogHomeScreenBase clickOnGoShoppingButton() {
        goShoppingButton.click();
        return initPage(getDriver(), CatalogHomeScreenBase.class);
    }

    @Override
    public String getScreenTitle() {
        return itemTitle.getText();
    }
}
