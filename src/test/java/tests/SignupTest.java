package tests;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class SignupTest extends BaseTest{
    @Test
    public void userRegisters(){
        //1 пользователь переходит на страницу регистрации
        //2 пользователь вводит эмэил пароль повтор пароля
        //3 нажимает кнопку сигн ап
        signupPage.open();
        signupPage.fillInRegistrationFieldsWithValidData("yaveg19397@inkiny.com","Dbrnjhbz_1105","Dbrnjhbz_1105");
        signupPage.clickSignUpButton();
        successfulRegistrationPage.isPageOpen();

        assertEquals(successfulRegistrationPage.getMassageAboutSuccessfulRegistration(),"We have successfully created your account and sent a confirmation email to:");

    }
}
