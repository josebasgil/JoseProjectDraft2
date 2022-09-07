package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.commonMethods;

public class Story09JoseBasPage extends commonMethods {

    @FindBy(xpath="//ul[@id='sidenav']/li[10]/a")
    public WebElement QualificationsBtn;

    @FindBy(id="addWorkExperience")
    public WebElement AddWorkExpBtn;

    @FindBy(id="experience_employer")
    public WebElement EmployerExpText;

    @FindBy(id="experience_jobtitle")
    public WebElement EmployerJobTitText;

    @FindBy(id="experience_from_date")
    public WebElement ExperienceFromDateText;

    @FindBy(id="experience_to_date")
    public WebElement ExperienceToDateText;

    @FindBy(id="experience_comments")
    public WebElement ExperienceCommentText;

    @FindBy(id="btnWorkExpSave")
    public WebElement ExperienceSaveButton;

    public Story09JoseBasPage(){
        PageFactory.initElements(driver, this);
    }

}
