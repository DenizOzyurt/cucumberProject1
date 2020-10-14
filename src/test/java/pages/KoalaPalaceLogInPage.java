package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KoalaPalaceLogInPage {

    public KoalaPalaceLogInPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Log in")
    public WebElement logInButton;

    @FindBy(id = "UserName")
    public WebElement userName;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(id = "btnSubmit")
    public WebElement btnSubmit;

    @FindBy(partialLinkText = "Scott")
    public WebElement managerText;



}
