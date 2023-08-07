package pages;

import elements.Input;
import elements.RadioButton;
import elements.TextArea;
import models.Project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProjectModalPage extends BasePage{
    public static final By CREATE_NEW_PROJECT_TITLE = By.xpath("//h3[@class='r_U3IU' and text()='Create new project']");

    public ProjectModalPage(WebDriver driver) {
        super(driver);
    }

    public RepositoryPage clickCreateProjectButton(){
        driver.findElement(CREATE_BUTTON).click();
        return new RepositoryPage(driver);
    }

    public ProjectsPage clickCancelButton(){
        driver.findElement(CANCEL_BUTTON).click();
        return new ProjectsPage(driver);
    }

    public RepositoryPage createProject(){
        new Input(driver,"Project name").write("Salesforce");
        new Input(driver,"Project code").write("SF");
        new TextArea(driver,"Description").write("Пользователь перходит по сылке");
        new RadioButton(driver,"Private").clickOnRadioButton();
        new RadioButton(driver,"Add all members to this project").clickOnRadioButton();
        return clickCreateProjectButton();

    }


    @Override
    public boolean isPageOpen() {
        return isExist(CREATE_NEW_PROJECT_TITLE);
    }
}
