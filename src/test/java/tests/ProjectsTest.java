package tests;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class ProjectsTest extends BaseTest{
    @Test
    public void userCreatesProject(){
        loginPage.userRegistersWithValidData();
        projectsPage.clickCreateNewProjectButton()
                .isPageOpen();
        projectModalPage.createProject();
        repositoryPage.isPageOpen();


        assertEquals(repositoryPage.getProjectCode(),"SF repository");
    }
}
