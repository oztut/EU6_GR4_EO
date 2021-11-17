
Feature: Login Functionality

   Scenario:User should NOT be able to login with Invalid credentials
    Given the user is on the login page
    And the user enters Invalid user name "hr500@cybertekschool.com"
    And the user enters valid password "UserUser"
    When the user clicks on the login button
    Then the user should NOT be able to login successfully


    Given the user is on the login page
    And the user enters valid user name "hr5@cybertekschool.com"
    And the user enters Invalid password "User123"
    When the user clicks on the login button
    Then the user should NOT be able to login successfully



    Given the user is on the login page
    And the user enters Invalid user name "hr5000@cybertekschool.com"
    And the user enters Invalid password "User123"
    When the user clicks on the login button
    Then the user should NOT be able to login successfully

 Scenario: User should NOT be able to login with blank username and password
  Given the user is on the login page
  And the user enters Invalid user name " "
  And the user enters Invalid password " "
  When the user clicks on the login button
  Then the user should NOT be able to login successfully
