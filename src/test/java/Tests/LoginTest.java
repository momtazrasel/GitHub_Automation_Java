package Tests;
import Base.Base;
import Pages.LoginPage;
import org.testng.annotations.Test;
public class LoginTest extends Base {
    @Test
    // TC01
    public void TC01() throws InterruptedException {
        LoginPage login = homePage.signIn();
        login.getSignUpButton();
        login.getWelcomeText();
        login.getEmail();
        login.getPassword();
        login.getPasswordError();

    }

    @Test
    // TC02
    public void TC02() throws InterruptedException {
        LoginPage login = homePage.signIn();
        login.getSignUpButton();
        login.getWelcomeText();
        login.getEmail();
        login.getPassword();
        login.getPasswordError();

    }



}
