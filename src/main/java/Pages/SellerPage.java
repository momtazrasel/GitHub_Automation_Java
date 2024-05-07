package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SellerPage {
    private WebDriver driver;
    private ReusableMethod reusableMethod;

    public SellerPage(WebDriver driver){
        this.driver = driver;
        this.reusableMethod = new ReusableMethod(driver);

    }

    public By becomeASeller = By.xpath("(//a[@class='woodmart-nav-link'])[14]");
    public By sellerDashboard = By.xpath("(//a[normalize-space()='Seller Dashboard'])[1]");

    public void getSellerTab(){
        reusableMethod.performMouseHover(driver, becomeASeller);
        reusableMethod.clickElement(becomeASeller);
    }
}
