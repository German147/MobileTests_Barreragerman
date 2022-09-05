//package mobileTest.common;
//
//import com.qaprosoft.carina.core.gui.AbstractPage;
//import org.openqa.selenium.WebDriver;
//
//public class ProductsFactory {
//
//    public AbstractPage getPage(String page) {
//        if (page==null || page.isEmpty() )
//            return null;
//        switch (page) {
//            case "LabOnesieTShirtBase":
//                return new LabOnesieTShirtBase() {
//                    @Override
//                    public String getProductTitle() {
//                        return null;
//                    }
//
//                    @Override
//                    public String getProductPrice() {
//                        return null;
//                    }
//
//                    @Override
//                    public void clickOnRadiobutton() {
//
//                    }
//
//                    @Override
//                    public String getValueRadioButton() {
//                        return null;
//                    }
//
//                    @Override
//                    public String getProductAmount() {
//                        return null;
//                    }
//
//                    @Override
//                    public void clickSubmittingMenu() {
//
//                    }
//
//                    @Override
//                    public String getProductSelectedStar() {
//                        return null;
//                    }
//
//                    @Override
//                    public void clickOnProductPlusButton() {
//
//                    }
//
//                    @Override
//                    public void clickOnProductMinusButton() {
//
//                    }
//                };
//
//            default: throw new IllegalArgumentException("Argument does not match " + page);
//
//        }
//
//    }
//}
