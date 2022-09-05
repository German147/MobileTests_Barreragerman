package mobileTest.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class BoltShirtBase extends AbstractPage {
    public BoltShirtBase(WebDriver driver) {
        super(driver);
    }

    public abstract String getProductTitle();

    public abstract String getProductPrice();

    public abstract void clickOnRadiobutton();

    public abstract String getValueRadioButton();

    public abstract String getProductAmount();

    public abstract void clickSubmittingMenu();

    public abstract String getProductSelectedStar();

    public abstract void clickOnProductPlusButton();

    public abstract void clickOnProductMinusButton();

}
