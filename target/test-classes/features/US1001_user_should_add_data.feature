@datatable
Feature: US1001_user_should_add_data

  Scenario: TC01_Testing_the_data_tables_web_page
    Given user is on the datables page
    And user clicks on the New button
    When user enter the first firstname
    When user enter the first lastname
    When user enter the first position
    When user enter the first office
    When user enter the first extension
    When user enter the first startDate
    When user enter the first salary
    And user clicks the create button
    And search for the firstname
    Then verify the name fields contains first name

