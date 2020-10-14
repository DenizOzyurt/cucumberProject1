package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KoalaPalaceRoomCreationPage {

    public KoalaPalaceRoomCreationPage(){

       PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Hotel Management")
    public WebElement HotelManagement;

    @FindBy(partialLinkText = "Hotel Rooms")
    public WebElement hotelRooms;

    @FindBy(xpath = "//span[@class='hidden-480']")
    public  WebElement addHotelroom;

    @FindBy(id = "IDHotel")
    public WebElement selectHotel;

    @FindBy(id="Code")
    public  WebElement code;

    @FindBy(id = "Name")
    public WebElement name;

    @FindBy(id = "Location")
    public WebElement location;

    @FindBy(xpath = "//textarea[@dir='ltr']")
    public WebElement textArea;

    @FindBy(id = "Price")
    public  WebElement price;

    @FindBy(partialLinkText = "300")
    public WebElement amountOfPrice;

    @FindBy(id = "IDGroupRoomType")
    public WebElement roomType;

    @FindBy(id = "MaxAdultCount")
    public WebElement MaxAdultCount;

    @FindBy(id = "MaxChildCount")
    public WebElement MaxChildCount;

    @FindBy(id = "btnSubmit")
    public WebElement btnSubmit;


}
