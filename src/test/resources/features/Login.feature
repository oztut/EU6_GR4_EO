@wip
Feature: Login Functionality

  Scenario: User should be able to login with valid credentials
    Given the user is on the login page
    And the user enters valid user name "hr44@cybertekschool.com"
    And the user enters valid password "UserUser"
    When the user clicks on the login button
    Then the user should be able to login homepage

  Scenario: User should be able to login with valid credentials
    Given the user is on the login page
    And the user enters valid user name "helpdesk27@cybertekschool.com"
    And the user enters valid password "UserUser"
    When the user clicks on the login button
    Then the user should be able to login homepage

  Scenario: User should be able to login with valid credentials
    Given the user is on the login page
    And the user enters valid user name "marketing54@cybertekschool.com"
    And the user enters valid password "UserUser"
    When the user clicks on the login button
    Then the user should be able to login homepage