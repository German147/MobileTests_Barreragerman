package mobileTest.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CatalogHomeScreenBase extends AbstractPage {
    public CatalogHomeScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract BackPackProductBase clickOnBackPack();

    public abstract BikeLightProductBase clickOnBikeLight();

    public abstract BoltShirtBase clickOnBoltTShirt();

    public abstract FleeceTShirtBase clickOnFleeceTShirt();

    public abstract ProductsBase clickOnLabOnesie();

    public abstract ProductsBase clickOnTestAllTShirt();

    public abstract ProductsBase clickOnSubmitting();

    public abstract void clickAddToCart();
    public abstract MenuScreenBase clickOnMenu();

    public abstract CartScreenBase clickGoToCart();

    public abstract CatalogHomeScreenBase clickOnCatalog();

    public abstract void clickOnSortingItem();

    public abstract void clickOnOptionMenu();

    public abstract String getCatalogTitle();

}
