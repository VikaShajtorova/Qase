package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    public static final By EMAIL = By.xpath("//input[@name='email']");
    public static final By PASSWORD = By.xpath("//input[@name='password']");
    public static final By SIGN_IN_BUTTON = By.xpath("//button[@type='submit']");


    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public LoginPage open(){
        driver.get(BASE_URL+"login");
        return this;
    }
    public LoginPage inputValidDataInEmailAndPasswordField(String email, String password){
        driver.findElement(EMAIL).sendKeys(email);
        driver.findElement(PASSWORD).sendKeys(password);
        return this;
    }
    public ProjectsPage clickSignInButton(){
        driver.findElement(SIGN_IN_BUTTON).click();
        return new ProjectsPage(driver);
    }

    public ProjectsPage userRegistersWithValidData(){
        open();
        inputValidDataInEmailAndPasswordField("shajtorova@mail.ru","Dbrf_110585");
        clickSignInButton();
        return new ProjectsPage(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(SIGN_IN_BUTTON);
    }
}
