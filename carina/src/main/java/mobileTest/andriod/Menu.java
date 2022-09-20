package mobileTest.andriod;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import mobileTest.common.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE,parentClass = MenuScreenBase.class)
public class Menu extends MenuScreenBase {

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/itemTV")
    private ExtendedWebElement catalog;

    @FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@content-desc=\"Recycler view for menu\"]/android.view.ViewGroup[2]/android.widget.TextView")
    private ExtendedWebElement webViewButton;

    @FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@content-desc=\"Recycler view for menu\"]/android.view.ViewGroup[3]/android.widget.TextView")
    private ExtendedWebElement qrScanner;

    @FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@content-desc=\"Recycler view for menu\"]/android.view.ViewGroup[5]/android.widget.TextView")
    private ExtendedWebElement drawingScreen;

    @FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@content-desc=\"Recycler view for menu\"]/android.view.ViewGroup[4]/android.widget.TextView")
    private ExtendedWebElement geoLocation;

    public Menu(WebDriver driver) {
        super(driver);
    }

    @Override
    public AboutOption clickOnAboutOption() {
        return null;
    }

    @Override
    public String getAboutText() {
        return null;
    }

    @Override
    public WebViewOptionsBase clickOnWebViewOption() {
       webViewButton.click();
        return initPage(getDriver(), WebViewOptionsBase.class);
    }

    @Override
    public ResetAppOption clickOnResentAppOption() {
        return null;
    }

    @Override
    public QRCodeScannerBase clickOnQRScannerOption() {
        qrScanner.click();
        return initPage(getDriver(), QRCodeScannerBase.class);
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
    public GeoLocationOptionBase clickOnGeoLocalizationOption() {
        geoLocation.click();
        return initPage(getDriver(), GeoLocationOptionBase.class);
    }

    @Override
    public DrawingOptionBase clickOnDrawingOption() {
       drawingScreen.click();
        return initPage(getDriver(), DrawingOptionBase.class);
    }

    @Override
    public CatalogHomeScreenBase clickOnCatalogOption() {
        catalog.click();
        return initPage(getDriver(),CatalogHomeScreenBase.class);
    }
}
