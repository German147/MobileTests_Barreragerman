package mobileTest.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import mobileTest.common.BackPackProductBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = BackPackProductBase.class)
public class IosBackPackProduct extends BackPackProductBase {


    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"Sauce Lab Back Packs\"`]")
    private ExtendedWebElement productTitle;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"$ 29.99\"`]")
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

    public IosBackPackProduct(WebDriver driver) {
        super(driver);
    }


    @Override
    public String getProductTitle() {
        return productTitle.getText();
    }

    @Override
    public String getProductPrice() {
        return productPrice.getText();
    }

    @Override
    public void clickOnRadiobutton() {
        blueButtonToClick.click();
    }

    @Override
    public String getValueRadioButton() {
        return valueOfRadioButton.getText();
    }

    @Override
    public String getProductAmount() {
        return amountOfProduct.getText();
    }

    @Override
    public void clickSubmittingMenu() {
        lastStarSubmitting.click();
    }

    @Override
    public String getProductSelectedStar() {
        return null;
    }

    @Override
    public void clickOnProductPlusButton() {
    addPlusButton.click();
    }

    @Override
    public void clickOnProductMinusButton() {
        minusButton.click();
    }

    @Override
    public void clickAddToCartButton() {
        addToCartButton.click();
    }

}
