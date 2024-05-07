package Tests;
import Base.Base;
import Pages.LoginPage;
import org.testng.annotations.Test;
public class LoginTest extends Base {
    @Test
    public void gitHubSignUp() throws InterruptedException {
        LoginPage login = homePage.signIn();
        login.getSignUpButton();
        login.getWelcomeText();
        login.getEmail();
//        login.getEnterButton();
//        login.getUsername();
//        login.getPassword();
//        login.getLogin();


    }



}
