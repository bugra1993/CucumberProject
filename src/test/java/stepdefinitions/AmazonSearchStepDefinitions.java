package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigurationReader;
import utilities.Driver;


public class AmazonSearchStepDefinitions {
    AmazonPage page = new AmazonPage();

    @Given("user go to amazon page")
    public void user_go_to_amazon_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("amazon_link"));

    }

    @Given("search headphones word")
    public void search_headphones_word() {
        page.searchBox.sendKeys(ConfigurationReader.getProperty("amazon_word") + Keys.ENTER);


    }

    @Then("print result stats")
    public void print_result_stats() {
        System.out.println(page.resultStats.getText());


    }

    @Given("user search camera")
    public void user_search_camera() {
        page.searchBox.sendKeys("camera" + Keys.ENTER);
    }

    @Given("user search {string}")
    public void user_search(String string) {
        page.searchBox.sendKeys(string + Keys.ENTER);

    }


}
