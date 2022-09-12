package mobileTest.Matias;

public class homepageEjemplo1 {

    /**
     * public class HomePage extends BasePage {
     *
     *     private final List<WebElement> links;
     *
     *     public HomePage(WebDriver driver) {
     *         super(driver);
     *         links = driver.findElements(By.xpath("//div[@id='content']//a"));
     *     }
     *
     *     public BasePage pageFactory(EPages page) throws PageNotFoundException {
     *         WebElement targetPage = findLink(page);
     *
     *         targetPage.click();
     *         switch (page) {
     *             case FORM_LOGIN:
     *                 return new FormLogin(driver);
     *             case DROPDOWN:
     *                 return new DropdownPage(driver);
     *             case HOVER:
     *                 return new HoverPage(driver);
     *             case ALERTS:
     *                 return new AlertsPage(driver);
     *             case FILE_UPLOADS:
     *                 return new FileUploadsPage(driver);
     *             case FILE_DOWNLOAD:
     *                 return new FileDownloadPage(driver);
     *             case FRAMES:
     *                 return new FramesPageFactory(driver);
     *             case WAITS:
     *                 return new WaitPageFactory(driver);
     *             case MULTIPLE_DROPDOWN:
     *                 return new MultipleDropDownPage(driver);
     *             default:
     *                 return null;
     *         }
     *     }
     *     private WebElement findLink(EPages page) throws PageNotFoundException {
     *
     *         Optional<WebElement> targetPage = links.stream()
     *                         .filter(l -> l.getText().equals(page.getText()))
     *                         .findFirst();
     *
     *         if (targetPage.isEmpty()) {
     *             throw new PageNotFoundException(page + " isn't exist.");
     *         }
     *         return targetPage.get();
     *     }
     */

}
