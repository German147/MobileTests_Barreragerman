package mobileTest.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class PriceAscendingOrderOption extends AbstractPage {
    public PriceAscendingOrderOption(WebDriver driver) {
        super(driver);
    }

    public abstract void clickOnPriceAscendingOrder();
}
