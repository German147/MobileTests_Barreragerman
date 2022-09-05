package mobileTest;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.zebrunner.agent.core.annotation.TestLabel;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TappingDifferentProducts implements IAbstractTest {

    @Test
    @MethodOwner(owner = "barreragerman")
    @TestLabel(name = "Navigating and Tapping on different products.", value = {"mobile", "practice"})
    public void testTappingDifferentProducts() {

//        iosCatalogHomeScreenBase catalogPage = new iosCatalogHomeScreenBase(getDriver());
//
//        IosBackPackProductBase backPackItem = catalogPage.clickOnBackPack();
//        String backpackTitle = backPackItem.getBackPackTitle();
//        clickOnIosCatalogeIcon(getDriver());
//        IosBikeLightProductBase bikeLightProduct = catalogPage.clickOnBikeLight();
//        String bikeLightTitle = bikeLightProduct.getName();
//
//
//        assertEquals(backpackTitle, "Sauce Lab Back Packs", "The product is incorrect");
//        assertEquals(bikeLightTitle, "Sauce Lab Bike Light", "The product is incorrect");
    }



}
