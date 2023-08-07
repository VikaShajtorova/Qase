package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessfulRegistrationPage extends BasePage{
    public static final By REGISTRATION_MASSAGE = By.xpath("//h1[@data-qase-test='congratulations']");
    public static final By MASSAGE = By.xpath("//div[@class='error404 text-start']//p[contains(text(),'created your account')]");


    public SuccessfulRegistrationPage(WebDriver driver) {
        super(driver);
    }

    public String getMassageAboutSuccessfulRegistration() {
        return driver.findElement(MASSAGE).getText();
    }

    @Override
    public boolean isPageOpen() {
        return isExist(REGISTRATION_MASSAGE);
    }
}
