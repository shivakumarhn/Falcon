package stepdefinitions;

import constatns.FrameworkConstants;
import driverfactory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchPage;

public class JobSearchSteps {

    private SearchPage searchPage = new SearchPage(DriverFactory.getDriver());

    @Given("User on home page")
    public void home_page() {
        DriverFactory.getDriver().get(FrameworkConstants.url());

    }

    @And("Enter keyword and location in input box")
    public void enter_location_in_where_input_box() {
        searchPage.enterTitle("quality");
        searchPage.selectSuggestion("quality inspector");
        searchPage.enterLocation("Benga");
        searchPage.selectSuggestion("Bengabad, Chhattisgarh");
    }

    @When("Click on find jobs button")
    public void click_on_find_jobs_button() {
        searchPage.clickFindJobs();
    }

    @Then("Search results should be displayed")
    public void search_results_should_be_displayed() {


    }


}
