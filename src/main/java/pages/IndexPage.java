package pages;

import assertions.RegisterAssertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class IndexPage extends MainPage {




    public RegisterAssertions registerAssertions;
    private String url;


    @FindBy(xpath = "//input[@id='email']")
    private WebElement inputEmail;
    @FindBy(xpath = "//input[@autocomplete='new-password']")
    private WebElement inputPassword;
    @FindBy(xpath = "//td[@id='uni_select_box']")
    private WebElement inputServer;
    @FindBy(xpath = "//div[@id='uni_selection']")
    private WebElement serverLists;
    @FindBy(xpath = "//input[@value='Rejestracja']")
    private WebElement clickRegister;

    @FindBy(xpath = "//input[@id='usernameLogin']")
    private WebElement inputLogin;

    @FindBy(xpath ="//input[@id='passwordLogin']")
    private WebElement inputLoginPassword;
    @FindBy(xpath = "//a[@id='loginBtn']")
    private WebElement loginButton;

    @FindBy(xpath = "//select[@name='uni']")
    private WebElement serverLoginLists;

    @FindBy(xpath = "//input[@value='Zaloguj się']")
    private WebElement clickLoginButtonOnIndexPage;



    public IndexPage(WebDriver driver,String url) {
        super(driver);
        PageFactory.initElements(driver, this);
        registerAssertions = new RegisterAssertions(driver);
        this.url=url;

    }

    public IndexPage openOgamePage() {
        driver.get(url);
        waitForPageLoad();
        return this;
    }

    public IndexPage setYourEmail(String email) {
        inputEmail.sendKeys(email);
        return this;
    }

    public IndexPage setYourPassword(String password) {
        inputPassword.sendKeys(password);
        return this;

    }

    public IndexPage selectServerFromDropDownList(String serverName) {
        inputServer.click();
        serverLists.findElement(By.xpath("//div[contains(@onclick,'" + serverName + "')]")).click();
        return this;
    }
    public AccountPage clickOnRegisterButton(){
        clickRegister.click();
        waitForPageLoad();
        return new AccountPage(driver);


    }

    public IndexPage setYourEmailToLogin(String login){
        inputLogin.sendKeys(login);
        return this;

    }
    public IndexPage setYourPasswordToLogin(String passwordToLogin){
        inputLoginPassword.sendKeys(passwordToLogin);
        return this;
    }
    public IndexPage loginButtonOnPage(){
        loginButton.click();
        return this;
    }

    public IndexPage selectServerToLogin(int index){
        Select severLogin = new Select(serverLoginLists);
        severLogin.selectByIndex(index);
        return this;
    }

    public AccountPage clickLoginInButton(){
        clickLoginButtonOnIndexPage.click();
        return new AccountPage(driver);

    }

}
