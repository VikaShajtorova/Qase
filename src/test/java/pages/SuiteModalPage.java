package pages;

import elements.Input;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuiteModalPage extends BasePage {
    public static final By CREATE_NEW_SUITE_TITLE = By.xpath("//h3[@class='r_U3IU']");
    String inputLocatorSuiteName = "//label[text()='Suite name']/ancestor::div[contains(@class,'qaOPP6')]//input";
    String inputLocatorSuite = "//label[text()='%s']/ancestor::div[contains(@class,'qaOPP6')]//p";
    String dropDownLocatorSuite = "//label[text()='Parent suite']/ancestor::div[contains(@class,'qaOPP6')]//input[@aria-autocomplete]";
    String optionDropDownLocatorSuite = "//span[@class='YaRdmB']//div[@class='vp8Qwu']";//TODO посмотреть локатор


    public SuiteModalPage(WebDriver driver) {
        super(driver);
    }


    public SuiteModalPage createSuite() {
        driver.findElement(By.xpath(inputLocatorSuiteName)).sendKeys("Authorization");
        driver.findElement(By.xpath(dropDownLocatorSuite)).click();
        driver.findElement(By.xpath(optionDropDownLocatorSuite)).click();
        driver.findElement(By.xpath(String.format(inputLocatorSuite, "Description"))).sendKeys("The user fills in the fields on the authorization page");
        driver.findElement(By.xpath(String.format(inputLocatorSuite, "Preconditions"))).sendKeys("User on the authorization page");
        return this;
    }

    public SuiteModalPage clickCreateButton() {
        driver.findElement(CREATE_BUTTON).click();
        return this;
    }

    @Override
    public boolean isPageOpen() {
        return isExist(CREATE_NEW_SUITE_TITLE);
    }
}
