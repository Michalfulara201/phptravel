package scenarios;

import pages.AccountPage;
import pages.IndexPage;

public class RegisterScenario implements Scenario<IndexPage, AccountPage> {


    private String login;
    private String password;


    public RegisterScenario(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public AccountPage run(IndexPage entry) {
        return entry.openOgamePage()

                .setYourEmail(login)
                .setYourPassword(password)
                .clickOnRegisterButton();



    }
}
