package mobileTest.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class ResetAppOption extends AbstractPage {
    public ResetAppOption(WebDriver driver) {
        super(driver);
    }

    public abstract void clickOnRestAppButton();

    public abstract void clickOnOKButton();

}
