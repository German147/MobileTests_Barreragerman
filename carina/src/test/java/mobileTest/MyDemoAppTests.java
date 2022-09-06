package mobileTest;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.zebrunner.agent.core.annotation.TestLabel;
import mobileTest.common.*;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MyDemoAppTests implements IAbstractTest {


    @Test
    @MethodOwner(owner = "barreraGerman")
    @TestLabel(name = "Navigating and Tapping on different products.", value = {"mobile", "practice"})
    public void tappingOnDifferentProductsTest() {

        CatalogHomeScreenBase homeScreen = initPage(getDriver(), CatalogHomeScreenBase.class);

        BackPackProductBase backPack = homeScreen.clickOnBackPack();
        String backPackTitle = backPack.getProductTitle();
        MenuScreenBase menu = homeScreen.clickOnMenu();
        menu.clickOnCatalogOption();
        BoltShirtBase boltShirt = homeScreen.clickOnBoltTShirt();
        String tShirtTitle = boltShirt.getProductTitle();
        homeScreen.clickOnMenu();
        menu.clickOnCatalogOption();
        FleeceTShirtBase fleece = homeScreen.clickOnFleeceTShirt();
        String fleeceTitle = fleece.getProductTitle();
        homeScreen.clickOnMenu();

        assertEquals(backPackTitle, "Sauce Lab Back Packs", "The product is incorrect");
        assertEquals(tShirtTitle, "Sauce Lab Bolt T-Shirt", "The product is incorrect");
        assertEquals(fleeceTitle,
                "Sauce Lab Fleece T-Shirt", "The product is incorrect");
    }

    @Test
    @MethodOwner(owner = "barreraGerman")
    @TestLabel(name = "Navigating and Tapping on different products.", value = {"mobile", "practice"})
    public void removeAProductFromCart() {

        CatalogHomeScreenBase homeScreen = initPage(getDriver(), CatalogHomeScreenBase.class);

        BackPackProductBase backPack = homeScreen.clickOnBackPack();
        backPack.clickAddToCartButton();
        backPack.clickAddToCartButton();
        backPack.clickAddToCartButton();
        CartScreenBase cart = homeScreen.clickGoToCart();
        String amountOfAddedItems = cart.getNumberOfItem(); // "3 Items"
        NoItemScreenBase noItemScreen = cart.clickOnRemove();
       // String noItemText = noItemScreen.getTitle();  //"No Items"

        noItemScreen.clickOnGoShoppingButton();   //"Products"
        String catalogTitle = homeScreen.getCatalogTitle();

        assertEquals(amountOfAddedItems, "3 Items", "The products were no added");
       // assertEquals(noItemText, "No Items", "The Items were not removed");
        assertEquals(catalogTitle, "Products", "Catalog screen was not opened");

    }

}
