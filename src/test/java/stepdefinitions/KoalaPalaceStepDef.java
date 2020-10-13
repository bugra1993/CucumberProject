package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.KoalaPalacePage;
import utilities.Driver;

public class KoalaPalaceStepDef {

    KoalaPalacePage page = new KoalaPalacePage();

    @Given("user goes to koala palace admin page")
    public void user_goes_to_koala_palace_admin_page() {
        Driver.getDriver().get("http://www.kaolapalace-qa-environment2.com/Account/LogOn?ReturnUrl=%2FAdmin%2FUserAdmin");

    }

    @Given("user enter username and password")
    public void user_enter_username_and_password() {
        page.username.sendKeys("manager2");
        page.password.sendKeys("Man1ager2!");

    }

    @Then("user sign in")
    public void user_sign_in() {
        page.login.click();

    }

    @Given("user goes to hotel create page")
    public void user_goes_to_hotel_create_page() {
        Driver.getDriver().get("http://www.kaolapalace-qa-environment2.com/admin/HotelAdmin/Create");
    }

    @Given("user enter code hotel create {string}")
    public void user_enter_code_hotel_create(String string) {
        page.hotelCreateCodeBox.sendKeys(string);

    }

    @Given("user enter name hotel create {string}")
    public void user_enter_name_hotel_create(String string) {
        page.hotelCreateNameBox.sendKeys(string);
    }

    @Given("user enter address hotel create {string}")
    public void user_enter_address_hotel_create(String string) {
        page.hotelCreateAddressBox.sendKeys(string);

    }

    @Given("user enter phone hotel create {string}")
    public void user_enter_phone_hotel_create(String string) {
        page.HotelCreatePhoneBox.sendKeys(string);
    }

    @Given("user enter email hotel create {string}")
    public void user_enter_email_hotel_create(String string) {
        page.hotelCreateEmailBox.sendKeys(string);
    }

    @Given("user choose id group hotel create {string}")
    public void user_choose_id_group_hotel_create(String string) {
        Select select = new Select(page.hotelCreateIDGroupDropDown);
        select.selectByVisibleText(string);

    }

    @Given("user clicks the save button hotel create")
    public void user_clicks_the_save_button_hotel_create() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.hotelCreateSaveButton.click();
    }

    @Then("user assert saving transaction")
    public void user_assert_saving_transaction() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(page.hotelCreateSuccessText.isDisplayed());

    }

    @Given("user go to {string} room create page")
    public void user_go_to_room_create_page(String string) {
        Driver.getDriver().get(string);

    }

    @Given("user selects IDHotel drop down {string} room create")
    public void user_selects_IDHotel_drop_down_room_create(String string) {
        Select select = new Select(page.hotelRoomCreateIDHotelDropDown);
        select.selectByVisibleText(string);

    }


    @Given("user enter code {string} room create")
    public void user_enter_code_room_create(String string) {
        page.hotelRoomCreateCodeBox.sendKeys(string);

    }

    @Given("user enter name {string} room create")
    public void user_enter_name_room_create(String string) {
        page.hotelRoomCreateNameBox.sendKeys(string);
    }

    @Given("user enter location {string} room create")
    public void user_enter_location_room_create(String string) {
        page.hotelRoomCreateLocationBox.sendKeys(string);
    }

    @Given("user enter description {string} room create")
    public void user_enter_description_room_create(String string) {
        page.hotelRoomCreateDescriptionTextArea.sendKeys(string);
    }

    @Given("user drag price to price box")
    public void user_drag_price_to_price_box() {
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(page.hotelRoomCreateSelectPrice, page.hotelRoomCreatePriceBox).perform();


    }

    @Given("user selects room type drop down {string} room create")
    public void user_selects_room_type_drop_down_room_create(String string) {
        Select select = new Select(page.hotelRoomCreateRoomTypeDropDown);
        select.selectByVisibleText(string);
    }

    @Given("user enter max adult count {string} room create")
    public void user_enter_max_adult_count_room_create(String string) {
        page.hotelRoomCreateMaxAdultCountBox.sendKeys(string);
    }

    @Given("user enter max children count {string} room create")
    public void user_enter_max_children_count_room_create(String string) {
        page.hotelRoomCreateMaxChildCountBox.sendKeys(string);
    }

    @Given("user clicks approve button")
    public void user_clicks_approve_button() {
        page.hotelRoomCreateApproveButton.click();

    }

    @Given("user clicks save button room create")
    public void user_clicks_save_button_room_create() {
        page.hotelRoomCreateSaveButton.click();
    }

    @Then("user assert saving transaction room create")
    public void user_assert_saving_transaction_room_create() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(page.hotelRoomCreateSuccessText.isDisplayed());

    }

    @Given("user go to {string} room reservation page")
    public void user_go_to_room_reservation_page(String string) {
        Driver.getDriver().get(string);
    }

    @Given("user select IDUser from first dropdown {string} room reservation")
    public void user_select_IDUser_from_first_dropdown_room_reservation(String string) {
        Select select = new Select(page.roomReservationIDUserDropDown);
        select.selectByVisibleText(string);
    }

    @Given("user select IDUser from second dropdown {string} room reservation")
    public void user_select_IDUser_from_second_dropdown_room_reservation(String string) {
        Select select = new Select(page.roomReservationIDHotelRoomDropDown);
        select.selectByVisibleText(string);
    }

    @Given("user enter to {string} price box room reservation")
    public void user_enter_to_price_box_room_reservation(String string) {
        page.roomReservationPriceBox.sendKeys(string);
    }

    @Given("user choose date from date start {string} room reservation")
    public void user_choose_date_from_date_start_room_reservation(String string) {
        page.roomReservationDateStart.sendKeys(string);
    }

    @Given("user choose date from date end {string} room reservation")
    public void user_choose_date_from_date_end_room_reservation(String string) {
        page.roomReservationDateEnd.sendKeys(string);
    }

    @Given("user enter Adult count {string} room reservation")
    public void user_enter_Adult_count_room_reservation(String string) {
        page.roomReservationAdultAmountBox.sendKeys(string);
    }

    @Given("user enter Child count {string} room reservation")
    public void user_enter_Child_count_room_reservation(String string) {
        page.roomReservationChildrenAmountBox.sendKeys(string);
    }

    @Given("user enter name and surname {string} room reservation")
    public void user_enter_name_and_surname_room_reservation(String string) {
        page.roomReservationContactNameSurnameBox.sendKeys(string);
    }

    @Given("user enter contact phone {string} room reservation")
    public void user_enter_contact_phone_room_reservation(String string) {
        page.roomReservationContactPhoneBox.sendKeys(string);
    }

    @Given("user enter email address {string} room reservation")
    public void user_enter_email_address_room_reservation(String string) {
        page.roomReservationContactEmailBox.sendKeys(string);
    }

    @Given("user enter notes to box {string} room reservation")
    public void user_enter_notes_to_box_room_reservation(String string) {
        page.roomReservationNotesBox.sendKeys(string);
    }

    @Given("user clicks approve button room reservation")
    public void user_clicks_approve_button_room_reservation() {
        page.roomReservationApprovedBox.click();
    }

    @Given("user clicks is paid button room reservation")
    public void user_clicks_is_paid_button_room_reservation() {
        page.roomReservationIsPaidBox.click();
    }

    @Given("user clicks save button room reservation")
    public void user_clicks_save_button_room_reservation() {
        page.roomReservationSaveButton.click();
    }

    @Given("user assert saving transaction room reservation")
    public void user_assert_saving_transaction_room_reservation() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOf(page.roomReservationSaveMessage)).isDisplayed());
    }

    @Then("user assert negative scenario")
    public void user_assert_negative_scenario() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }
        Assert.assertTrue(page.errorMessages.isDisplayed());
    }


}
