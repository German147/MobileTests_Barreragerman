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
    public void testTappingOnDifferentProducts() {

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
//        assertEquals(catalogTitle, "Products", "Catalog screen was not opened");

    }

    @Test
    @MethodOwner(owner = "barreraGerman")
    @TestLabel(name = "Click on submitting button", value = {"mobile", "practice"})
    public void testSubmittingReviewButton() {
//
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
    public void testAddPlusItemProduct() {

    CatalogHomeScreenBase homePage = initPage(getDriver(), CatalogHomeScreenBase.class);

        ProductDetailsScreenBase backPack = homePage.clickOnProduct();
        backPack.swipeUp();
        backPack.clickOnProductPlusButton();
        String numberOfItems = backPack.getProductAmount();

        assertEquals(numberOfItems,"2","The button was not tap");

    }

}
