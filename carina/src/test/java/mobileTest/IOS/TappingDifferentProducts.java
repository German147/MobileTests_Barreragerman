package mobileTest.IOS;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.zebrunner.agent.core.annotation.TestLabel;
import mobileTest.BikeLightPage;
import mobileTest.HomePageGer;
import mobileTest.BackPackPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TappingDifferentProducts implements IAbstractTest {

    @Test
    @MethodOwner(owner = "barreragerman")
    @TestLabel(name = "tapping a product", value = {"mobile", "practice"})
    public void testTappingDifferentProducts() {
        HomePageGer homePageGer = new HomePageGer(getDriver());

        BackPackPage backPackPage = homePageGer.clickOnProduct();
        String backpackTitle = backPackPage.getBackPackTitle();
        backPackPage.clickOnBackToCatalog();

        BikeLightPage bikeLightPage = homePageGer.clickOnBikeLight();
        String bikeLightTitle = bikeLightPage.getName();

        assertEquals(backpackTitle, "Sauce Lab Back Packs", "The product is incorrect");
        assertEquals(bikeLightTitle, "Sauce Lab Bike Light", "The product is incorrect");
    }

}
