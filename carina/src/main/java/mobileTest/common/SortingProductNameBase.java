package mobileTest.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public abstract class SortingProductNameBase extends AbstractPage {
    public SortingProductNameBase(WebDriver driver) {
        super(driver);
    }

    public abstract List<WebElement> gettingProductsName();

    public abstract List<String> sortProductTextsFunction(List<WebElement> elements);

    public abstract List<String> parsingWebElementToString(List<WebElement>elements);
}