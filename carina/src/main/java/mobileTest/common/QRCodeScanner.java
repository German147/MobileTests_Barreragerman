package mobileTest.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class QRCodeScanner extends AbstractPage {
    public QRCodeScanner(WebDriver driver) {
        super(driver);
    }

    public abstract String getQRText();

}
