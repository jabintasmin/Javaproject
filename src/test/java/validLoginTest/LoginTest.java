package validLoginTest;

import controller.LogInController;
import base.ScriptBase;
import org.testng.annotations.Test;


public class LoginTest extends ScriptBase {
    LogInController logInController;


    @Test
    public void verifySignInButtonDisplay(){
        logInController= new LogInController(driver);
       logInController.validLogInInput();

    }

}

