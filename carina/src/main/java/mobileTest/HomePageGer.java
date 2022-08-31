package mobileTest;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import static com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type.IOS_PHONE;


@DeviceType(pageType = IOS_PHONE, parentClass = AbstractUIObject.class)
public class HomePageGer extends AbstractUIObject {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"ProductItem\"`][1]")
    private ExtendedWebElement backPack;
   @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"ProductItem\"`][2]")
    private ExtendedWebElement bikeLight;

    public HomePageGer(WebDriver driver) {
        super(driver);
    }

    public BackPackPage clickOnProduct() {
        backPack.click();
        return new BackPackPage(getDriver());
    }

    public BikeLightPage clickOnBikeLight() {
        bikeLight.click();
        return new BikeLightPage(getDriver());

    }
}
