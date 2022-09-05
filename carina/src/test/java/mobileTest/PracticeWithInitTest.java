package mobileTest;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.zebrunner.agent.core.annotation.TestLabel;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PracticeWithInitTest implements IAbstractTest {

    @Test
    @MethodOwner(owner = "barreragerman")
    @TestLabel(name = "Navigating and Tapping on different products.", value = {"mobile", "practice"})
    public void practiceWIthInit() {

//        CatalogHomeScreenBase homeScreen = initPage(getDriver(), CatalogHomeScreenBase.class);
//        ProductsBase productsBase = homeScreen.clickOnBackPack();
//        String title = productsBase.getProductTitle();
//
//
//        assertEquals(title,"Sauce Lab Back Packs");

        // Assert.assertTrue(homeScreen.isPageOpened(), "ScreenPage is not opened");
    }
}
