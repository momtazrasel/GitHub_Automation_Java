package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SupplierPage {
    public WebDriver driver;
    private ReusableMethod reusableMethod;

    public SupplierPage(WebDriver driver) {
        this.driver = driver;
        this.reusableMethod = new ReusableMethod(driver);
    }

    public By supplierPage = By.xpath("(//h1[normalize-space()='Supplier'])[1]");

    public void getSupplierPage() throws InterruptedException {

        reusableMethod.isElementDisplayed(supplierPage);
    }
}
