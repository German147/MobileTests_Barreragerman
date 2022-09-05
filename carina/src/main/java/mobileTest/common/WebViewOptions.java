package mobileTest.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class WebViewOptions extends AbstractPage {
    public WebViewOptions(WebDriver driver) {
        super(driver);
    }

    public abstract void sendKeyURl();

    public abstract void clickOnGoToSiteButton();

}
