import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import scenarios.LoginScenario;

public class LoginTests extends MainTest {




    @BeforeMethod
    @Parameters({"url"})

    @Test

    public void shouldLogIn(){
        indexPage.run(new LoginScenario("testtestest@gmail.com","123456789",5))
                .loginAssertion.isUserLoggedIn();

    }
    @Test
    public void shouldNotLogInWithWrongPassword(){
        indexPage.run(new LoginScenario("testtestest@gmail.com","1289",5))
                .loginAssertion.userNotLoggedwithWrongCredentials();
    }
    @Test
    public void shouldNotLogInWithoutLogin(){
        indexPage.run(new LoginScenario("","123456789",5))
                .loginAssertion.userNotLoggedwithWrongCredentials();
    }
    @Test
    public void shouldNotLoginWithWrongServer(){
        indexPage.run(new LoginScenario("testtestest@gmail.com","123456789",4))
                .loginAssertion.userNotLoggedwithWrongCredentials();
    }

}
