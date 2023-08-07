package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProjectsPage extends BasePage{
    public static final By PROJECTS_TITLE = By.xpath("//div[@class='col-lg-12']//h1[text()='Projects']");
    public static final By CREATE_NEW_PROJECT_BUTTON = By.id("createButton");

    public ProjectsPage(WebDriver driver) {
        super(driver);
    }

    public ProjectsPage open(){
        driver.get(BASE_URL+"projects");
        return this;
    }


    public ProjectModalPage clickCreateNewProjectButton(){
        driver.findElement(CREATE_NEW_PROJECT_BUTTON).click();
        return new ProjectModalPage(driver);
    }

    public RepositoryPage getLatestProjectInListAndClick(){
        driver.findElement(By.xpath("//tr[@class='project-row'][last()]//a[@class='project-name']")).click();
        return new RepositoryPage(driver);

    }

    @Override
    public boolean isPageOpen() {
        return isExist(PROJECTS_TITLE);
    }
}
