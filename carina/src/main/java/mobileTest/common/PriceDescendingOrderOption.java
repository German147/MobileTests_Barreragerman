package mobileTest.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class PriceDescendingOrderOption extends AbstractPage {
    public PriceDescendingOrderOption(WebDriver driver) {
        super(driver);
    }

    public abstract void clickOnPriceDescendingOption();
}
