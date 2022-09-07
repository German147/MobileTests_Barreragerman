package mobileTest.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import mobileTest.common.AlertScreenBase;
import mobileTest.common.ProductDetailsScreenBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = ProductDetailsScreenBase.class)
public class ProductDetailsScreen extends ProductDetailsScreenBase {
    public ProductDetailsScreen(WebDriver driver) {
        super(driver);
    }

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"Sauce Lab Fleece T-Shirt\"`]")
    private ExtendedWebElement fleeceTitle;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"Sauce Lab Bike Light\"`]")
    private ExtendedWebElement BikeLiteTitle;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"Sauce Lab Bolt T-Shirt\"`]")
    private ExtendedWebElement tShirtTitle;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"Sauce Lab Back Packs\"`]")
    private ExtendedWebElement productTitle;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"$ <WritePriceHere>\"`]")
    private ExtendedWebElement productPrice;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"BlueColorUnSelected Icons\"`]")
    private ExtendedWebElement blueButtonToClick;

    // when the radio button is selected this is the object **/XCUIElementTypeButton[`value == "1"`]
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`value == \"1\"`]")
    private ExtendedWebElement valueOfRadioButton;

    @FindBy(id = "Amount")
    private ExtendedWebElement amountOfProduct;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"StarUnSelected Icons\"`]")
    private ExtendedWebElement lastStarSubmitting;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"Add To Cart\"`]")
    private ExtendedWebElement addToCartButton;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"SubtractMinus Icons\"`]")
    private ExtendedWebElement minusButton;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"AddPlus Icons\"`]")
    private ExtendedWebElement addPlusButton;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"StarSelected Icons\"`][2]")
    private ExtendedWebElement submitButton;


    @Override
    public String getProductTitle() {
        return null;
    }

    @Override
    public String getProductPrice() {
        return null;
    }

    @Override
    public void clickOnRadiobutton() {

    }

    @Override
    public String getValueRadioButton() {
        return null;
    }

    @Override
    public String getProductAmount() {
        return null;
    }

    @Override
    public void clickSubmittingMenu() {

    }

    @Override
    public String getProductSelectedStar() {
        return null;
    }

    @Override
    public void clickOnProductPlusButton() {

    }

    @Override
    public void clickOnProductMinusButton() {

    }

    @Override
    public void clickAddToCartButton() {

    }

    @Override
    public AlertScreenBase clickOnSubmitStar() {
        return null;
    }

    @Override
    public void swipeUp() {

    }
}
