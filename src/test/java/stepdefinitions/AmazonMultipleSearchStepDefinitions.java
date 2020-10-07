package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.AmazonPage;
import utilities.Driver;

public class AmazonMultipleSearchStepDefinitions {
    AmazonPage page = new AmazonPage();

    @Given("user go to {string} page")
    public void user_go_to_page(String string) {
        Driver.getDriver().get(string);

    }

    @Given("search dropdown {string}  amazon")
    public void search_dropdown_amazon(String string) {
        Select select = new Select(page.dropDown);
        select.selectByVisibleText(string);
    }

    @Given("search in box {string}  amazon")
    public void search_in_box_amazon(String string) {
        page.searchBox.sendKeys(string + Keys.ENTER);
    }

    @Then("print result stats from amazon page")
    public void print_result_stats_from_amazon_page() {
        System.out.println(page.resultStats.getText());
    }
}
