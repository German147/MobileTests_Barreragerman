package mobileTest.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class DrawingOption extends AbstractPage {
    public DrawingOption(WebDriver driver) {
        super(driver);
    }

    public abstract String getDrawingText();
}
