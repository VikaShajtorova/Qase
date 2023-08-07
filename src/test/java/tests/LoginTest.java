package tests;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    @Test
    public void userIsLoggedInWithValidData(){
        boolean isProjectPage = loginPage.open()
                .inputValidDataInEmailAndPasswordField("shajtorova@mail.ru","Dbrf_110585")
                .clickSignInButton()
                .isPageOpen();


        assertTrue(isProjectPage);
    }



}
