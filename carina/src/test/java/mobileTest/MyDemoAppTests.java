package mobileTest;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.zebrunner.agent.core.annotation.TestLabel;
import exceptions.ProductNotFoundException;
import mobileTest.andriod.EnumProducts;
import mobileTest.common.*;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MyDemoAppTests implements IAbstractTest {
    /**
     * In order to test the app here are the products available:
     * "BackPacks","BoltTShirt","FleeceTShirt","OnesieTShirt","AllThingsTShirt"
     */

    @Test
    @MethodOwner(owner = "barreraGerman")
    @TestLabel(name = "Navigating and Tapping on different products.", value = {"mobile", "practice"})
    public void testTappingOnDifferentProducts() {
        /**
         * In order to test the app here are the products available:
         * "BackPacks","BoltTShirt","FleeceTShirt","OnesieTShirt","AllThingsTShirt"
         */
//        CatalogHomeScreenBase homeScreen = initPage(getDriver(), CatalogHomeScreenBase.class);
//
//        BackPackProductBase backPack = homeScreen.clickOnBackPack();
//        String backPackTitle = backPack.getProductTitle();
//        MenuScreenBase menu = homeScreen.clickOnMenu();
//        menu.clickOnCatalogOption();
//        BoltShirtBase boltShirt = homeScreen.clickOnBoltTShirt();
//        String tShirtTitle = boltShirt.getProductTitle();
//        homeScreen.clickOnMenu();
//        menu.clickOnCatalogOption();
//        FleeceTShirtBase fleece = homeScreen.clickOnFleeceTShirt();
//        String fleeceTitle = fleece.getProductTitle();
//        homeScreen.clickOnMenu();
//
//        assertEquals(backPackTitle, "Sauce Lab Back Packs", "The product is incorrect");
//        assertEquals(tShirtTitle, "Sauce Lab Bolt T-Shirt", "The product is incorrect");
//        assertEquals(fleeceTitle,
//                "Sauce Lab Fleece T-Shirt", "The product is incorrect");
    }

    @Test
    @MethodOwner(owner = "barreraGerman")
    @TestLabel(name = "Navigating and Tapping on different products.", value = {"mobile", "practice"})
    public void testAddAndRemoveAProductFromCart() {
        /**
         * In order to test the app here are the products available:
         * "BackPacks","BoltTShirt","FleeceTShirt","OnesieTShirt","AllThingsTShirt"
         */
        CatalogHomeScreenBase homeScreen = initPage(getDriver(), CatalogHomeScreenBase.class);

//        BackPackProductBase backPack = homeScreen.clickOnBackPack();
//        backPack.clickAddToCartButton();
//        CartScreenBase cart = homeScreen.clickGoToCart();
//        String amountOfAddedItems = cart.getNumberOfItem();
//        NoItemScreenBase noItemScreen = cart.clickOnRemove();
//
//        noItemScreen.clickOnGoShoppingButton();
//        String catalogTitle = homeScreen.getCatalogTitle();
//
//        assertEquals(amountOfAddedItems, "1 Items", "The products were no added");
//        assertEquals(catalogTitle, "EnumProducts", "Catalog screen was not opened");

    }

    @Test
    @MethodOwner(owner = "barreraGerman")
    @TestLabel(name = "Click on submitting button", value = {"mobile", "practice"})
    public void testSubmittingReviewButton() {
        /**
         * In order to test the app here are the products available:
         * "BackPacks","BoltTShirt","FleeceTShirt","OnesieTShirt","AllThingsTShirt"
         */
//        CatalogHomeScreenBase homePage = initPage(getDriver(), CatalogHomeScreenBase.class);
//
//        BackPackProductBase submitButton = homePage.clickOnBackPack();
//        AlertScreenBase alertScreen = submitButton.clickOnSubmitStar();
//        String alertText = alertScreen.getAlertText();
//        homePage.clickOnContinueOK();
//
//        assertEquals(alertText,
//                "Thank you for submitting your review!", "The button was not tap");
    }

    @Test
    @MethodOwner(owner = "barreraGerman")
    @TestLabel(name = "Click on Add plus button", value = {"mobile", "practice"})
    public void testAddPlusItemProduct() throws ProductNotFoundException {
        /**
         * In order to test the app here are the products available:
         * "BackPacks","BoltTShirt","FleeceTShirt","OnesieTShirt","AllThingsTShirt"
         */

        CatalogHomeScreenBase homePage = initPage(getDriver(), CatalogHomeScreenBase.class);
        ProductDetailsScreenBase product = homePage.selectProduct("BoltTShirt");
        product.swipeUp();
        product.clickOnProductPlusButton();


        // homePage.productFactory(EnumProducts.BACKPACKS.getXpaths().click()


        //product = homePage.productFactory(EnumProducts.SAUCE_LAB_BOLT_T_SHIRT);

//        ProductDetailsScreenBase backPack = homePage.clickOnProduct();
//        backPack.swipeUp();
//        backPack.clickOnProductPlusButton();
//        String numberOfItems = backPack.getProductAmount();
//
//        assertEquals(numberOfItems,"2","The button was not tap");

    }

}
