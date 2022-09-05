package mobileTest.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class GeoLocationOption extends AbstractPage {
    public GeoLocationOption(WebDriver driver) {
        super(driver);
    }

    public abstract String getGeoLocationTitle();

}
