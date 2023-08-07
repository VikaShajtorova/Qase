package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage extends BasePage{
    public static final By SIGN_UP_BUTTON = By.xpath("//button[@type='submit']");
    public static final By E_MAIL = By.xpath("//input[@placeholder='E-Mail']");
    public static final By PASSWORD = By.xpath("//input[@placeholder='Password']");
    public static final By PASSWORD_CONFIRMATION = By.xpath("//input[@placeholder='Password confirmation']");
    String informationalMessage = "//small[@class='VV3w3Z']";
    public SignupPage(WebDriver driver) {
        super(driver);
    }
    public SignupPage open(){
        driver.get(BASE_URL+"signup");
        return this;
    }
    public SignupPage fillInRegistrationFieldsWithValidData(String email, String password, String passwordConfirmation){
        driver.findElement(E_MAIL).sendKeys(email);
        driver.findElement(PASSWORD).sendKeys(password);
        driver.findElement(PASSWORD_CONFIRMATION).sendKeys(passwordConfirmation);
        return this;
    }

    public SuccessfulRegistrationPage clickSignUpButton(){
        driver.findElement(SIGN_UP_BUTTON).click();
        return new SuccessfulRegistrationPage(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(SIGN_UP_BUTTON);
    }
}
