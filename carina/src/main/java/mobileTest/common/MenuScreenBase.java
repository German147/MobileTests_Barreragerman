package mobileTest.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class MenuScreenBase extends AbstractPage {
    public MenuScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract AboutOption clickOnAboutOption();
    public abstract String getAboutText();

    public abstract WebViewOptionsBase clickOnWebViewOption();

    public abstract ResetAppOption clickOnResentAppOption();

    public abstract QRCodeScanner clickOnQRScannerOption();

    public abstract PushNotificationOption clickOnPushNotificationOption();

    public abstract LoginOption clickOnLoginOption();

    public abstract GeoLocationOption clickOnGeoLocalizationOption();

    public abstract DrawingOption clickOnDrawingOption();

    public abstract CatalogHomeScreenBase clickOnCatalogOption();


}
