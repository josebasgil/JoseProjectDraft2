package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.commonMethods;

import static utils.commonMethods.driver;

public class Story08JoseBasPage extends commonMethods {

    @FindBy(id="menu_pim_viewPimModule")
    public WebElement pimOption;

    @FindBy(id="menu_pim_viewEmployeeList")
    public WebElement employeeListOption;

    @FindBy(xpath="//table[@id='resultTable']/tbody/tr[1]/td[2]/a")
    public WebElement randomEmployeeOption;

    @FindBy(xpath="//div[@id='content']/div/div[1]/ul/li[4]/a")
    public WebElement EmployeeDependentOption;

    @FindBy(id="btnAddDependent")
    public WebElement employeeDependentAdd;

    @FindBy(xpath="//input[@name='dependent[name]']")
    public WebElement addEmployeeTextBox;

    @FindBy(id="dependent_relationshipType")
    public WebElement employeeDependentType;

    @FindBy(xpath="//input[@name='dependent[relationship]']")
    public WebElement employeeDependentRelation;

    @FindBy(id="dependent_dateOfBirth")
    public WebElement employeeDependentBirth;

    @FindBy(id="btnSaveDependent")
    public WebElement employeeDependentSave;

    public Story08JoseBasPage(){
        PageFactory.initElements(driver, this);
    }

}
