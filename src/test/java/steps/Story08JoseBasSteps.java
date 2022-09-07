package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.Story08JoseBasPage;
import utils.commonMethods;

import java.util.List;

public class Story08JoseBasSteps extends commonMethods {

    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
        click(addEmployeeDependent.pimOption);
    }
    @When("user clicks List Button")
    public void user_clicks_list_button() {
        click(addEmployeeDependent.employeeListOption);
    }
    @When("random employee id code")
    public void random_employee_id_code() {
        click(addEmployeeDependent.randomEmployeeOption);
    }
    @When("user clicks on Dependents button")
    public void user_clicks_on_dependents_button() {
        click(addEmployeeDependent.EmployeeDependentOption);
    }
    @When("user clicks on Add button")
    public void user_clicks_on_add_button() {
        click(addEmployeeDependent.employeeDependentAdd);

    }

    @When("user enter {string} , {string} and {string}")
    public void user_enter_and(String FName, String Relationship, String DateOfBirth) {
        sendText(addEmployeeDependent.addEmployeeTextBox, FName);
        selectDropdown(addEmployeeDependent.employeeDependentType,"Other");
        sendText(addEmployeeDependent.employeeDependentRelation, Relationship);
        sendText(addEmployeeDependent.employeeDependentBirth, DateOfBirth);
    }
    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        click(addEmployeeDependent.employeeDependentSave);
    }
    @Then("employee dependent added successfully")
    public void employee_dependent_added_successfully() {
        System.out.println("Employee dependent added");
    }
}
