package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class GoogleSearchStepDefinitions {


    GooglePage googlePage=new GooglePage();

    @Given("user is on the google page")
    public void user_is_on_the_google_page() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
        Thread.sleep(4000);
    }


    @Given("user search for iphone")
    public void user_search_for_iphone() throws InterruptedException {
        Thread.sleep(2000);
        googlePage.searchBox.sendKeys("iphone"+ Keys.ENTER);
        Thread.sleep(2000);

    }
    @Then("verify the result has iphone")
    public void verify_the_result_has_iphone() {
        String pageTitle=Driver.getDriver().getTitle().toLowerCase();
        Assert.assertTrue(pageTitle.contains("iphone"));

    }
    @Given("user search for tea pot")
    public void user_search_for_tea_pot() {

        googlePage.searchBox.sendKeys("tea pot"+Keys.ENTER);
    }
    @Then("verify the result has tea pot")
    public void verify_the_result_has_tea_pot() {
        String pageTitle=Driver.getDriver().getTitle().toLowerCase();
        Assert.assertTrue(pageTitle.contains("tea pot"));

    }
    @Given("user search for flower")
    public void user_search_for_flower() {
        googlePage.searchBox.sendKeys("flower"+Keys.ENTER);


    }
    @Then("verify the result has flower")
    public void verify_the_result_has_flower() {

        String pageTitle=Driver.getDriver().getTitle().toLowerCase();
        Assert.assertTrue(pageTitle.contains("flower"));

    }


    @Given("user search for {string}")
    public void user_search_for(String string) {
        googlePage.searchBox.sendKeys(string+Keys.ENTER);
    }

    @Then("verify the result has {string}")
    public void verify_the_result_has(String string) {
        String pageTitle=Driver.getDriver().getTitle().toLowerCase();
        Assert.assertTrue(pageTitle.contains(string));
        Assert.fail();
    }

}
