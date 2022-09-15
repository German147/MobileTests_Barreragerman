package mobileTest;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.zebrunner.agent.core.annotation.TestLabel;
import mobileTest.common.*;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MyDemoAppTests implements IAbstractTest {
    /*
      In order to test the app here are the products available:
      "BackPacks","BoltTShirt","FleeceTShirt","OnesieTShirt","AllThingsTShirt"
     */

    @Test
    @MethodOwner(owner = "barreraGerman")
    @TestLabel(name = "Navigating and Tapping on different products.", value = {"mobile", "practice"})
    public void testTappingOnDifferentProducts() {
        /*
          In order to test the app here are the products available:
          "BackPacks","BoltTShirt","FleeceTShirt","OnesieTShirt","AllThingsTShirt"
         */

        CatalogHomeScreenBase homePage = initPage(getDriver(), CatalogHomeScreenBase.class);
        ProductDetailsScreenBase product = homePage.selectProduct("BackPacks");

        String bacPack = product.getProductTitle();
        MenuScreenBase menu = homePage.clickOnMenu();
        menu.clickOnCatalogOption();
        homePage.selectProduct("BoltTShirt");
        String boltTitle = product.getProductTitle();
        homePage.clickOnMenu();
        menu.clickOnCatalogOption();
        homePage.selectProduct("FleeceTShirt");
        String fleece = product.getProductTitle();

        homePage.clickOnMenu();
        menu.clickOnCatalogOption();

        assertEquals(bacPack, "Sauce Lab Back Packs", "The product is incorrect");
        assertEquals(boltTitle, "Sauce Lab Bolt T-Shirt", "The product is incorrect");
        assertEquals(fleece,
                "Sauce Lab Fleece T-Shirt", "The product is incorrect");
    }

    //Sauce Lab Back Packs
    @Test
    @MethodOwner(owner = "barreraGerman")
    @TestLabel(name = "Navigating and Tapping on different products.", value = {"mobile", "practice"})
    public void testAddAndRemoveAProductFromCart() {
        /*
          In order to test the app here are the products available:
          "BackPacks","BoltTShirt","FleeceTShirt","OnesieTShirt","AllThingsTShirt"
         */
        CatalogHomeScreenBase homePage = initPage(getDriver(), CatalogHomeScreenBase.class);
        ProductDetailsScreenBase product = homePage.selectProduct("BoltTShirt");
        product.swipeUp();
        product.clickOnProductPlusButton();
        String amountOfAddedItems = product.getProductAmount();
        product.clickAddToCartButton();
        CartScreenBase cart = homePage.clickGoToCart();
        NoItemScreenBase noItemScreen = cart.clickOnRemove();

        noItemScreen.clickOnGoShoppingButton();
        String catalogTitle = homePage.getCatalogTitle();

        assertEquals(amountOfAddedItems, "2", "The products were not added");
        assertEquals(catalogTitle, "Products", "Catalog screen was not opened");

    }

    @Test
    @MethodOwner(owner = "barreraGerman")
    @TestLabel(name = "Click on submitting button", value = {"mobile", "practice"})
    public void testSubmittingReviewButton() {
        /*
          In order to test the app here are the products available:
          "BackPacks","BoltTShirt","FleeceTShirt","OnesieTShirt","AllThingsTShirt"
         */
        CatalogHomeScreenBase homePage = initPage(getDriver(), CatalogHomeScreenBase.class);
        ProductDetailsScreenBase product = homePage.selectProduct("BoltTShirt");
        AlertScreenBase alertScreen = product.clickOnSubmitStar();

        String alertText = alertScreen.getAlertText();
        alertScreen.clickContinueAlert();
        MenuScreenBase menu = homePage.clickOnMenu();
        menu.clickOnCatalogOption();

        assertEquals(alertText,
                "Thank you for submitting your review!", "The button was not tap");
    }

    @Test
    @MethodOwner(owner = "barreraGerman")
    @TestLabel(name = "Click on Add plus button", value = {"mobile", "practice"})
    public void testAddPlusItemProduct() {
        /*
          In order to test the app here are the products available:
          "BackPacks","BoltTShirt","FleeceTShirt","OnesieTShirt","AllThingsTShirt"
         */

        CatalogHomeScreenBase homePage = initPage(getDriver(), CatalogHomeScreenBase.class);
        ProductDetailsScreenBase product = homePage.selectProduct("BoltTShirt");
        product.swipeUp();
        product.clickOnProductPlusButton();
        String numberOfItems = product.getProductAmount();
        MenuScreenBase manu = homePage.clickOnMenu();
        manu.clickOnCatalogOption();

        assertEquals(numberOfItems, "2", "The button was not tap");

    }

    @Test
    @MethodOwner(owner = "barreraGerman")
    @TestLabel(name = "Click on Add plus button", value = {"mobile", "practice"})
    public void testMinusButton() {
        /*
          In order to test the app here are the products available:
          "BackPacks","BoltTShirt","FleeceTShirt","OnesieTShirt","AllThingsTShirt"
         */
        CatalogHomeScreenBase homePage = initPage(getDriver(), CatalogHomeScreenBase.class);
        ProductDetailsScreenBase product = homePage.selectProduct("BackPacks");
        product.swipeUp();
        product.clickOnProductPlusButton();
        product.clickOnProductPlusButton();
        product.clickAddToCartButton();
        CartScreenBase cart = homePage.clickGoToCart();
        cart.clickOnMinusButton();
        String numberOfItem = cart.getNumberOfItem();
        MenuScreenBase menu = homePage.clickOnMenu();
        menu.clickOnCatalogOption();

        assertEquals(numberOfItem, "2", "The button does not work");


    }


}
