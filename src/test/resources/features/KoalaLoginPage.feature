
@smoke
Feature: US0002_user_shuold_logIn_admin_page

  Scenario: TC01_Testing_the_LogIn_page
    Given user is on the KoalaPalace page
    And user click the log in button
    When user enter the username
    When user enter the password
    And user click the submit button
    And search for the manager
    Then verify the text comtains manager
