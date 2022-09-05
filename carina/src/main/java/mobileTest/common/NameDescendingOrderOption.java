package mobileTest.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class NameDescendingOrderOption extends AbstractPage {
    public NameDescendingOrderOption(WebDriver driver) {
        super(driver);
    }

    public abstract void clickOnNameDescendingOrder();
}
