package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.EbayPage;
import utilities.Driver;

public class EbaySearchStepDefinitions {
    EbayPage ebayPage = new EbayPage();

    @Given("user go to {string}")
    public void user_go_to(String string) {
        Driver.getDriver().get(string);
    }

    @Given("search {string}")
    public void search(String string) {
        ebayPage.searchBox.sendKeys(string + Keys.ENTER);
    }

    @Then("print result stats on ebay")
    public void print_result_stats_on_ebay() {
        System.out.println(ebayPage.resultStats.getText());
    }
}
