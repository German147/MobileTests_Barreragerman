package mobileTest.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class LoginOption extends AbstractPage {
    public LoginOption(WebDriver driver) {
        super(driver);
    }

    public abstract String getLoginText();

    public abstract void clickOnMailOption();

    public abstract void clickLogin();
}
