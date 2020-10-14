@regression
Feature: US1003_user_should_add_data_with_parameter

  Scenario Outline: TC01_Testing_the_data_tables_web_page
    Given user is on the datables page
    And user clicks on the New button
    When user enter the first firstname "<firstname>"
    When user enter the first lastname "<lastname>"
    When user enter the first position "<position>"
    When user enter the first office "<office>"
    When user enter the first extension "<extension>"
    When user enter the first startDate "<startDate>"
    When user enter the first salary "<salary>"
    And user clicks the create button
    And search for the firstname "<firstname>"
    Then verify the name fields contains first name "<firstname>"

    Examples: test data for the data table test
    |firstname|lastname|position|office|extension|startDate | salary|
    |jon      |sam     |doct    |str   |999      |2020-10-12|490000|
    |sam      |exs     |sdet    |str   |333333   |2020-08-09|540000|
    |ali      |cam     |qa      |antep |443334   |2020-10-12|490000|
    |can      |tepe    |dev     |urfa  |49393    |2020-08-18|-540000|
    |bil      |ot      |uat     |maras |44       |2020-10-28|49000099|
    |kim      |paris   |unit    |van   |333393   |2020-08-01 |000000|
