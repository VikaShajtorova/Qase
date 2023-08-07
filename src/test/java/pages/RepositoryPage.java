package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RepositoryPage extends BasePage{
    public static final By REPOSITORY_TITLE = By.xpath("//h1[@class='fGDnu0']");
    public static final By SUITE_BUTTON = By.id("create-suite-button");

    public RepositoryPage(WebDriver driver) {
        super(driver);
    }

    public String getProjectCode(){
        String projectCode = driver.findElement(REPOSITORY_TITLE).getText();
        return projectCode;
    }

    public SuiteModalPage clickSuiteButton(){
        driver.findElement(SUITE_BUTTON).click();
        return new SuiteModalPage(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(REPOSITORY_TITLE);
    }
}
