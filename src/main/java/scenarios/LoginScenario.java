package scenarios;

import pages.AccountPage;
import pages.IndexPage;
import pages.MainPage;

public class LoginScenario implements Scenario <IndexPage, AccountPage>{





    private String login;
    private String password;
    private int serverNumber;




    public LoginScenario(String login, String password, int serverIndexNumber) {

        this.serverNumber=serverIndexNumber;
        this.login=login;
        this.password=password;
    }



    @Override
    public AccountPage run(IndexPage entry) {
        return entry.openOgamePage()
                .loginButtonOnPage()
                .setYourEmailToLogin(login)
                .setYourPasswordToLogin(password)
                .selectServerToLogin(serverNumber)
                .clickLoginInButton();
    }
}
