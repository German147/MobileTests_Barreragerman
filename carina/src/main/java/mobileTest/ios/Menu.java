package mobileTest.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import mobileTest.common.*;
import org.openqa.selenium.WebDriver;

import static com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type.IOS_PHONE;

@DeviceType(pageType = IOS_PHONE, parentClass = MenuScreenBase.class)
public class Menu extends MenuScreenBase {
    public Menu(WebDriver driver) {
        super(driver);
    }


    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`name == \"Catalog-tab-item\"`]")
    private ExtendedWebElement catalog;

    @Override
    public AboutOption clickOnAboutOption() {
        return null;
    }

    @Override
    public String getAboutText() {
        return null;
    }

    @Override
    public WebViewOptions clickOnWebViewOption() {
        return null;
    }

    @Override
    public ResetAppOption clickOnResentAppOption() {
        return null;
    }

    @Override
    public QRCodeScanner clickOnQRScannerOption() {
        return null;
    }

    @Override
    public PushNotificationOption clickOnPushNotificationOption() {
        return null;
    }

    @Override
    public LoginOption clickOnLoginOption() {
        return null;
    }

    @Override
    public GeoLocationOption clickOnGeoLocalizationOption() {
        return null;
    }

    @Override
    public DrawingOption clickOnDrawingOption() {
        return null;
    }

    @Override
    public CatalogHomeScreenBase clickOnCatalogOption() {
       catalog.click();
        return initPage(getDriver(),CatalogHomeScreenBase.class);
    }
}
