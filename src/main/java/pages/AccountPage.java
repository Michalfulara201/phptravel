package pages;

import assertions.LoginAssertion;
import assertions.RegisterAssertions;
import org.openqa.selenium.WebDriver;

public  class AccountPage extends MainPage {


    public RegisterAssertions registerAssertions;
    public LoginAssertion loginAssertion;

    public AccountPage(WebDriver driver) {
        super(driver);
        registerAssertions = new RegisterAssertions(driver);
        loginAssertion = new LoginAssertion(driver);
    }
}