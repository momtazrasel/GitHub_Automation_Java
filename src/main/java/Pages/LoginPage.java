package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public WebDriver driver;
    public ReusableMethod reusableMethod;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.reusableMethod = new ReusableMethod(driver);
    }

    public By signUpButton =By.xpath("(//a[normalize-space()='Sign up'])[1]");
    public By welcomeText =By.xpath("(//span[@class='text-mono text-gray-light-mktg'])[1]");
    public By email =By.xpath("(//input[@id='email'])[1]");
    public By continueButton =By.xpath("(//button[@data-continue-to='password-container'])[1]");
    public By password =By.xpath("(//input[@id='password'])[1]");
    public By loginButton =By.xpath("(//button[normalize-space()='Log in'])[1]");
    public By passwordOne =By.xpath("//input[@id = 'input_wp_protect_password']");
    public By enterButton =By.xpath("//input[@class = 'button button-primary button-login']");


    public void getSignUpButton() {
//        Thread.sleep(1000);
        reusableMethod.clickElement(signUpButton);
//        driver.findElement(username).sendKeys("madhu.rajan@transcpginc.com");

    }

    public void getUsername() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(email).sendKeys("madhu.rajan@transcpginc.com");
    }

    public void getEmail() throws InterruptedException {
        Thread.sleep(1000);
//        driver.findElement(email).sendKeys("wsww5666164w@adv.bg");
        reusableMethod.clickElement(email);
        reusableMethod.sendKeysToElement(email, "wsww5666164w@adv.bg");
        reusableMethod.clickElement(continueButton);
        Thread.sleep(3000);
    }

    public void getContinueButton() throws InterruptedException {
        Thread.sleep(1000);
//        driver.findElement(email).sendKeys("wsww5666164w@adv.bg");
        reusableMethod.clickElement(continueButton);
        reusableMethod.sendKeysToElement(email, "wsww5666164w@adv.bg");
    }

    public void getWelcomeText() throws InterruptedException {
        Thread.sleep(1000);
        reusableMethod.isElementDisplayed(welcomeText);
        String x = reusableMethod.getTextOfElement(welcomeText);
        System.out.printf("Welcome text is: "+ x);
    }


    public void getPassword() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(password).sendKeys("##Bid2Bill$$");
        Thread.sleep(1000);
    }

    public void getPasswordOne() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(passwordOne).sendKeys("#2ndmay2024#");
        Thread.sleep(1000);
    }

    public void getLogin() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(loginButton).click();
        Thread.sleep(1000);
    }

    public void getEnterButton() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(enterButton).click();
        Thread.sleep(1000);
    }
}
