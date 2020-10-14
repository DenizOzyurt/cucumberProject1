package stepdefinitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.KoalaPalaceRoomCreationPage;
import utilities.Driver;

public class KoalaPalaceRoomCreationStepsDefinition {

    KoalaPalaceRoomCreationPage roomCreation=new KoalaPalaceRoomCreationPage();
    @When("click Hotel Management")
    public void click_hotel_management() {
    roomCreation.HotelManagement.click();
    }

    @When("click Hotel Rooms")
    public void click_hotel_rooms() throws InterruptedException {
        roomCreation.hotelRooms.click();
        Thread.sleep(3000);
   }
    @When("click ADD HOTELROOMS")
    public void click_add_hotelrooms() throws InterruptedException {
        roomCreation.addHotelroom.click();
        Thread.sleep(3000);
  }
    @When("Select Hotel as {string}")
    public void select_hotel_as(String string) {
        Select opt=new Select(roomCreation.selectHotel);
        opt.selectByIndex(3);
   }
    @When("enter the hotel {string}")
    public void enter_the_hotel(String string) {
    roomCreation.code.sendKeys("67000");
  }
    @When("enter the {string}")
    public void enter_the(String string) {
    roomCreation.name.sendKeys("aliYanBakmaz");
    }

    @When("enter the location {string}")
    public void enter_the_location(String string) {
        roomCreation.location.sendKeys("Strasbourg");
 }
    @When("write the {string}")
    public void write_the(String string) {
        roomCreation.textArea.sendKeys("Reserved for two whole weeks");
   }
    @When("drag and drop the {string}")
    public void drag_and_drop_the(String string) throws InterruptedException {
        Thread.sleep(2000);
        Actions act=new Actions(Driver.getDriver());
        act.dragAndDrop(roomCreation.price,roomCreation.amountOfPrice).perform();
  }
    @When("select the {string}")
    public void select_the(String string) {
    Select opt=new Select(roomCreation.roomType);
    opt.selectByIndex(7);

    }

    @When("write the adult {string}")
    public void write_the_adult(String string) {
    roomCreation.MaxAdultCount.sendKeys("2");

  }
    @When("write the child {string}")
    public void write_the_child(String string) {
        roomCreation.MaxChildCount.sendKeys("2");
  }
    @When("click save button")
    public void click_save_button() throws InterruptedException {
        Thread.sleep(2000);
        roomCreation.btnSubmit.click();
   }

}
