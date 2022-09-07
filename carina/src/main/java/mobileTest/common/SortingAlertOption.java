package mobileTest.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class SortingAlertOption extends AbstractPage {
    public SortingAlertOption(WebDriver driver) {
        super(driver);
    }

    public abstract void clickOnAscendingName();
    public abstract void clickOnNameDescendingOrder();
    public abstract void clickOnPriceAscendingOrder();
    public abstract void clickOnPriceDescendingOption();
}
