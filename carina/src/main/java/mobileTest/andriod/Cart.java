package mobileTest.andriod;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import mobileTest.common.CartScreenBase;
import mobileTest.common.CatalogHomeScreenBase;
import mobileTest.common.NoItemScreenBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE,parentClass = CartScreenBase.class)
public class Cart extends CartScreenBase {
    public Cart(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Container for fragments\"]/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.TextView")
    private ExtendedWebElement numberOfItem;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/removeBt")
    private ExtendedWebElement removeButton;

    @Override
    public NoItemScreenBase clickOnRemove() {
       removeButton.click();
        return initPage(getDriver(), NoItemScreenBase.class);
    }

    @Override
    public void clickToCheckOut() {

    }

    @Override
    public String getNumberOfItem() {
        return numberOfItem.getText();
    }

    @Override
    public CatalogHomeScreenBase clickOnGoShoppingButton() {
        return null;
    }

    @Override
    public String getNoItemTitle() {
        return null;
    }
}
