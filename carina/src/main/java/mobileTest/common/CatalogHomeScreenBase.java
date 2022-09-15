package mobileTest.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CatalogHomeScreenBase extends AbstractPage {

    public CatalogHomeScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract AlertScreenBase clickOnContinueOK();

    public abstract void clickAddToCart();

    public abstract MenuScreenBase clickOnMenu();

    public abstract CartScreenBase clickGoToCart();

    public abstract CatalogHomeScreenBase clickOnCatalog();

    public abstract void clickOnSortingItem();

    public abstract void clickOnOptionMenu();

    public abstract String getCatalogTitle();

    public abstract String checkSubmitButton();

   // public abstract ProductDetailsScreenBase productFactory(EnumProducts product) throws ProductNotFoundException;

    public abstract ProductDetailsScreenBase selectProduct(String product);


}
