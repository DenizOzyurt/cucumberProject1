


  Feature: US1002_user_should_add_data_with_parameter
    @regression
  Scenario: TC01_Testing_the_data_tables_web_page
    Given user is on the datables page
    And user clicks on the New button
    When user enter the first firstname "deniz"
    When user enter the first lastname "ozyurt"
    When user enter the first position "sdet"
    When user enter the first office "strasbourg"
    When user enter the first extension "333344"
    When user enter the first startDate "2020-10-10"
    When user enter the first salary "42000"
    And user clicks the create button
    And search for the firstname "deniz"
    Then verify the name fields contains first name "deniz"

    @regression
  Scenario: TC02_Testing_the_data_tables_web_page
    Given user is on the datables page
    And user clicks on the New button
    When user enter the first firstname "veysel"
    When user enter the first lastname "kacmaz"
    When user enter the first position "sdet"
    When user enter the first office "strasbourg"
    When user enter the first extension "333344"
    When user enter the first startDate "2020-10-10"
    When user enter the first salary "42000"
    And user clicks the create button
    And search for the firstname "veysel"
    Then verify the name fields contains first name "veysel"

  Scenario: TC03_Testing_the_data_tables_web_page
    Given user is on the datables page
    And user clicks on the New button
    When user enter the first firstname "veysel3"
    When user enter the first lastname "kacmaz"
    When user enter the first position "sdet"
    When user enter the first office "strasbourg"
    When user enter the first extension "333344"
    When user enter the first startDate "2020-10-10"
    When user enter the first salary "42000"
    And user clicks the create button
    And search for the firstname "veysel3"
    Then verify the name fields contains first name "veysel3"

  Scenario: TC04_Testing_the_data_tables_web_page
    Given user is on the datables page
    And user clicks on the New button
    When user enter the first firstname "veysel4"
    When user enter the first lastname "kacmaz4"
    When user enter the first position "sdet"
    When user enter the first office "strasbourg"
    When user enter the first extension "333344"
    When user enter the first startDate "2020-10-10"
    When user enter the first salary "42000"
    And user clicks the create button
    And search for the firstname "veysel4"
    Then verify the name fields contains first name "veysel4"

  Scenario: TC05_Testing_the_data_tables_web_page
    Given user is on the datables page
    And user clicks on the New button
    When user enter the first firstname "veysel5"
    When user enter the first lastname "kacmaz5"
    When user enter the first position "sdet"
    When user enter the first office "strasbourg"
    When user enter the first extension "333344"
    When user enter the first startDate "2020-10-10"
    When user enter the first salary "42000"
    And user clicks the create button
    And search for the firstname "veysel5"
    Then verify the name fields contains first name "veysel5"

