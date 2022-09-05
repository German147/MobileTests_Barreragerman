package mobileTest.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class TappingOnDifferentProducts extends AbstractPage {
    public TappingOnDifferentProducts(WebDriver driver) {
        super(driver);
    }

    public abstract void clickOnAProduct();

    public abstract void clickOnMenuOption();

    public abstract void clickOnCatalog();
}
