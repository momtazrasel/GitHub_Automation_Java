package Pages;


import org.openqa.selenium.WebDriver;

public class HomePage {

    public final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage signIn(){
        return new LoginPage(driver);
    }
    public SupplierPage supplier(){
        return new SupplierPage(driver);
    }
    public SellerPage seller(){
        return new SellerPage(driver);
    }

}
