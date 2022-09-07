package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.commonMethods;

public class Story09JoseBasSteps extends commonMethods {

    @When("user clicks on Qualifications button")
    public void user_clicks_on_qualifications_button() {
        click(addEmployeeWExperience.QualificationsBtn);
    }

    @When("user clicks on add button from Work Experience")
    public void user_clicks_on_add_button_from_work_experience() {
        click(addEmployeeWExperience.AddWorkExpBtn);
    }

    @When("user enters Company, Job Title, From date, To date and Comment")
    public void user_enters_company_job_title_from_date_to_date_and_comment() {
        sendText(addEmployeeWExperience.EmployerExpText, "SODIMAC");
        sendText(addEmployeeWExperience.EmployerJobTitText, "QA Analyst");
        sendText(addEmployeeWExperience.ExperienceFromDateText, "2010-02-11");
        sendText(addEmployeeWExperience.ExperienceToDateText, "2012-03-20");
        sendText(addEmployeeWExperience.ExperienceCommentText, "Quality Assurance for import products");
    }

    @When("user clicks on save button of work experience")
    public void user_clicks_on_save_button_of_work_experience() {
        click(addEmployeeWExperience.ExperienceSaveButton);
    }

    @Then("user has succesfully added work experience")
    public void user_has_succesfully_added_work_experience() {
        System.out.println("Employee experience has been added");
    }
}
