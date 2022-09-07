Feature: Add employee dependents

  Background:
    When user enters valid admin username and password
    And user clicks on login button
    Then admin user is successfully logged in and see the message "Welcome Admin"

  @SprintLogin1
  Scenario Outline: Add multiple employee dependents
    When user clicks on PIM option
    And user clicks List Button
    And random employee id code
    And user clicks on Dependents button
    And user clicks on Add button
    When user enter "<FName>" , "<Relationship>" and "<DateOfBirth>"
    And user clicks on save button
    Then employee dependent added successfully
    Examples:
      |FName  |Relationship |DateOfBirth |
      |Jose  |Brother      |1982-09-29  |
      |Ani   |Sister       |1975-06-08  |