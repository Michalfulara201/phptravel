import org.testng.annotations.Test;

public class RegistrationTests extends MainTest {


    @Test

    public void shouldNotRegister(){
        indexPage.openOgamePage()
                .setYourEmail("testtestest@gmail.com")
                .setYourPassword("123456789")
                .selectServerFromDropDownList("Deimos ")
                .clickOnRegisterButton()


                .registerAssertions.isUserRegistered();



    }
}
