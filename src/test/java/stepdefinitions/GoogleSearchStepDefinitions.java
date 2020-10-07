package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class GoogleSearchStepDefinitions {
    GooglePage googlePage = new GooglePage();

    @Given("user go to google page")
    public void user_go_to_google_page() {


        Driver.getDriver().get(ConfigurationReader.getProperty("google_link"));

    }

    @Given("search techproeducation")
    public void search_techproeducation() {

        googlePage.searchBox.sendKeys(ConfigurationReader.getProperty("google_word") + Keys.ENTER);

    }

    @Then("check the page title")
    public void check_the_page_title() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(Driver.getDriver().getTitle().contains(ConfigurationReader.getProperty("google_word")));

    }

}