package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.commonMethods;
import utils.configReader;

import static steps.pageInitializer.login;

public class loginSteps extends commonMethods {
    @Given("user is navigated to HRMS application")
    public void user_is_navigated_to_hrms_application() throws InterruptedException {
        openBrowserAndLaunchApplication();
    }
    @When("user enters valid admin username and password")
    public void user_enters_valid_admin_username_and_password() throws InterruptedException {
        //  WebElement usernameTextField = driver.findElement(By.id("txtUsername"));
        // usernameTextField.sendKeys("admin");
        //  LoginPage login = new LoginPage();
        sendText(login.usernameTextField, configReader.getPropertyValue("username"));

        //  WebElement passwordTextField = driver.findElement(By.id("txtPassword"));
        //  passwordTextField.sendKeys("Hum@nhrm123");
        sendText(login.passwordTextField, configReader.getPropertyValue("password"));
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() throws InterruptedException {
        // WebElement loginButton = driver.findElement(By.id("btnLogin"));
        //  loginButton.click();
        //  Thread.sleep(2000);
        // LoginPage login = new LoginPage();
        click(login.loginButton);
    }

    @Then("admin user is successfully logged in")
    public void admin_user_is_successfully_logged_in() {
        System.out.println("Test passed");
        // closeBrowser();
    }
}
