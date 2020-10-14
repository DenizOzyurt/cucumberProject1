package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.KoalaPalaceLogInPage;
import utilities.ConfigReader;
import utilities.Driver;

public class KoalaPalaceLogInStepsDefinitions {

    KoalaPalaceLogInPage koalaPalaceLogInPage=new KoalaPalaceLogInPage();

    @Given("user is on the KoalaPalace page")
    public void user_is_on_the_koala_palace_page() {
        Driver.getDriver().get(ConfigReader.getProperty("kaola_url"));

  }


    @Given("user click the log in button")
    public void user_click_the_log_in_button() {
        koalaPalaceLogInPage.logInButton.click();

  }

    @When("user enter the username")
    public void user_enter_the_username() {
        koalaPalaceLogInPage.userName.sendKeys(ConfigReader.getProperty("username"));
  }

    @When("user enter the password")
    public void user_enter_the_password() {
        koalaPalaceLogInPage.password.sendKeys(ConfigReader.getProperty("password"));
  }

    @When("user click the submit button")
    public void user_click_the_submit_button() {
        koalaPalaceLogInPage.btnSubmit.click();
 }

    @When("search for the manager")
    public void search_for_the_manager() {
        koalaPalaceLogInPage.managerText.click();
}

    @Then("verify the text comtains manager")
    public void verify_the_text_comtains_manager() {
        String verification=koalaPalaceLogInPage.managerText.getText();
        Assert.assertTrue(verification.contains("Scott"));
 }

}
