Feature: Add Employee Work Experience

  Background:
    When user enters valid admin username and password
    And user clicks on login button
    Then admin user is successfully logged in and see the message "Welcome Admin"
    When user clicks on PIM option
    And user clicks List Button
    And random employee id code

  @SprintLogin1
  Scenario: Add Employee work experience
    When user clicks on Qualifications button
    And user clicks on add button from Work Experience
    And user enters Company, Job Title, From date, To date and Comment
    And user clicks on save button of work experience
    Then user has succesfully added work experience
