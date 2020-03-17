package co.uk.zoopla.stepDefinitions;

import co.uk.zoopla.pages.BasePage;
import co.uk.zoopla.pages.Homepage;
import co.uk.zoopla.pages.SearchResultPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class SearchForSaleSteps extends BasePage
{
    Homepage homepage = PageFactory.initElements(driver, Homepage.class);
    SearchResultPage searchResultPage = PageFactory.initElements(driver, SearchResultPage.class);

    @Given("I navigate to zoopla homepage")
public void i_navigate_to_zoopla_homepage()
    {
launchURL();
}

    @When("I enter a {string} in the search text box")
    public void i_enter_a_in_the_search_text_box(String string) {

    }

    @When("I select {string} from Min price dropdown")
    public void i_select_from_Min_price_dropdown(String string) {

    }

    @When("I select {string} from Max price dropdown")
    public void i_select_from_Max_price_dropdown(String string) {

    }

    @When("I select {string} from Property type dropdown")
    public void i_select_from_Property_type_dropdown(String string) {

    }

    @When("I select {string} from Bedrooms dropdown")
    public void i_select_from_Bedrooms_dropdown(String string) {

    }

    @When("I click on Search button")
    public void i_click_on_Search_button() {

    }

    @Then("a list of {string} in {string} are displayed")
    public void a_list_of_in_are_displayed(String string, String string2) {

    }

    @Then("I click on one of the results links")
    public void i_click_on_one_of_the_results_links() {

    }


}
