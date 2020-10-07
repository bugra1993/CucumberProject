package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KoalaPalacePage {

    public KoalaPalacePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "UserName")
    public WebElement username;
    @FindBy(id = "Password")
    public WebElement password;
    @FindBy(xpath = "//button[.='Log in']")
    public WebElement login;
    @FindBy(id = "Code")
    public WebElement hotelCreateCodeBox;
    @FindBy(id = "Name")
    public WebElement hotelCreateNameBox;
    @FindBy(id = "Address")
    public WebElement hotelCreateAddressBox;
    @FindBy(id = "Phone")
    public WebElement HotelCreatePhoneBox;
    @FindBy(id = "Email")
    public WebElement hotelCreateEmailBox;
    @FindBy(id = "IDGroup")
    public WebElement hotelCreateIDGroupDropDown;
    @FindBy(id = "btnSubmit")
    public WebElement hotelCreateSaveButton;
    @FindBy(className = "bootbox-body")
    public WebElement hotelCreateSuccessText;

    @FindBy(className = "bootbox-body")
    public WebElement hotelRoomCreateSuccessText;
    @FindBy(id = "IDHotel")
    public WebElement hotelRoomCreateIDHotelDropDown;
    @FindBy(id = "Code")
    public WebElement hotelRoomCreateCodeBox;
    @FindBy(id = "Name")
    public WebElement hotelRoomCreateNameBox;
    @FindBy(id = "Location")
    public WebElement hotelRoomCreateLocationBox;
    @FindBy(xpath = "//textarea[@dir='ltr']")
    public WebElement hotelRoomCreateDescriptionTextArea;
    @FindBy(id = "Price")
    public WebElement hotelRoomCreatePriceBox;
    @FindBy(partialLinkText = "400")
    public WebElement hotelRoomCreateSelectPrice;
    @FindBy(id = "IDGroupRoomType")
    public WebElement hotelRoomCreateRoomTypeDropDown;
    @FindBy(id = "MaxAdultCount")
    public WebElement hotelRoomCreateMaxAdultCountBox;
    @FindBy(id = "MaxChildCount")
    public WebElement hotelRoomCreateMaxChildCountBox;
    @FindBy(id = "IsAvailable")
    public WebElement hotelRoomCreateApproveButton;
    @FindBy(id = "btnSubmit")
    public WebElement hotelRoomCreateSaveButton;


}
