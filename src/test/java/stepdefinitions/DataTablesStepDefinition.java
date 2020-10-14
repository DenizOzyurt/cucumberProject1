package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablePage;
import utilities.ConfigReader;
import utilities.Driver;

public class DataTablesStepDefinition {

    DataTablePage dataTablePage=new DataTablePage();

    @Given("user is on the datables page")
    public void user_is_on_the_datables_page() {
        Driver.getDriver().get(ConfigReader.getProperty("data_table_url"));

  }

    @Given("user clicks on the New button")
    public void user_clicks_on_the_new_button() {
        dataTablePage.newButton.click();
 }


    @When("user enter the first firstname")
    public void user_enter_the_first_firstname() {
        dataTablePage.firstName.sendKeys("ali");

    }

    @When("user enter the first lastname")
    public void user_enter_the_first_lastname() {
        dataTablePage.lastName.sendKeys("kacmaz");

    }

    @When("user enter the first position")
    public void user_enter_the_first_position() {
        dataTablePage.position.sendKeys("sdet");
 }

    @When("user enter the first office")
    public void user_enter_the_first_office() {
        dataTablePage.office.sendKeys("France");
  }

    @When("user enter the first extension")
    public void user_enter_the_first_extension() {
        dataTablePage.extension.sendKeys("99999");
  }

    @When("user enter the first startDate")
    public void user_enter_the_first_start_date() {
        dataTablePage.startDate.sendKeys("2020-10-04");
 }

    @When("user enter the first salary")
    public void user_enter_the_first_salary() {
        dataTablePage.salary.sendKeys("10000000");
   }


    @When("user clicks the create button")
    public void user_clicks_the_create_button() {
        dataTablePage.create.click();
 }

    @When("search for the firstname")
    public void search_for_the_firstname() {
        dataTablePage.search.sendKeys("ali");
   }

    @Then("verify the name fields contains first name")
    public void verify_the_name_fields_contains_first_name() {
        Assert.assertTrue(dataTablePage.nameField.getText().contains("ali"));
  }

//==========================================================================================================

    @When("user enter the first firstname {string}")
    public void user_enter_the_first_firstname(String string) {
        dataTablePage.firstName.sendKeys(string);
   }

    @When("user enter the first lastname {string}")
    public void user_enter_the_first_lastname(String string) {
        dataTablePage.lastName.sendKeys(string);
    }

    @When("user enter the first position {string}")
    public void user_enter_the_first_position(String string) {
        dataTablePage.position.sendKeys(string);
   }
    @When("user enter the first office {string}")
    public void user_enter_the_first_office(String string) {
        dataTablePage.office.sendKeys(string);
  }
    @When("user enter the first extension {string}")
    public void user_enter_the_first_extension(String string) {
        dataTablePage.extension.sendKeys(string);
  }
    @When("user enter the first startDate {string}")
    public void user_enter_the_first_start_date(String string) {
        dataTablePage.startDate.sendKeys(string);
  }
    @When("user enter the first salary {string}")
    public void user_enter_the_first_salary(String string) {
        dataTablePage.salary.sendKeys(string);
  }
    @When("search for the firstname {string}")
    public void search_for_the_firstname(String string) {
        dataTablePage.search.sendKeys(string);
  }
    @Then("verify the name fields contains first name {string}")
    public void verify_the_name_fields_contains_first_name(String string) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(dataTablePage.nameField.getText().contains(string));

    }

}
