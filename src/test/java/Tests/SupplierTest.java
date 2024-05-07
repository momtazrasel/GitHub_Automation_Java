package Tests;
import Pages.SupplierPage;
import org.testng.annotations.Test;

public class SupplierTest extends LoginTest{

    @Test
    public void supplierPage() throws InterruptedException {
        gitHubSignUp();
        SupplierPage supplierPage = homePage.supplier();
        supplierPage.getSupplierPage();
    }
}
