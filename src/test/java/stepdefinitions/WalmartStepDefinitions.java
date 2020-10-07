package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.WalmartPage;
import utilities.Driver;

public class WalmartStepDefinitions {
    WalmartPage page = new WalmartPage();

    @Given("user go to {string} walmart page")
    public void user_go_to_walmart_page(String string) {
        Driver.getDriver().get(string);
    }

    @Given("search {string} in walmart page")
    public void search_in_walmart_page(String string) {
        page.searchBox.sendKeys(string + Keys.ENTER);

    }

    @Then("print result stats from walmart page")
    public void print_result_stats_from_walmart_page() {
        System.out.println(page.resultStats.getText());
    }

}
