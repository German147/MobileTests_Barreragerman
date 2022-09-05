package mobileTest.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class NameAscendingOrderOption extends AbstractPage {
    public NameAscendingOrderOption(WebDriver driver) {
        super(driver);
    }

    public abstract void clickOnAscendingName();
}
