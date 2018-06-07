package assertions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.MainPage;

public class LoginAssertion extends MainPage {

    @FindBy(xpath ="//a[@class='menubutton  selected']" )
    private WebElement menuButton;
    @FindBy(xpath = "//div[@class='usernameLoginformError parentFormloginForm formError']")
    private WebElement loginButtonVisible;

    public LoginAssertion(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }

    public void isUserLoggedIn(){
        Assert.assertTrue(menuButton.isDisplayed());
    }

    public void userNotLoggedwithWrongCredentials(){
        Assert.assertTrue(loginButtonVisible.isDisplayed());
    }
}
