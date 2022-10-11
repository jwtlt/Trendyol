package youtube.step_definition;

import io.cucumber.java.en.*;
import youtube.pages.*;
import youtube.utilities.*;

import static org.junit.jupiter.api.Assertions.*;

public class WatchTheLastCityGame {

    Base_Page base_page = new Base_Page();

    @Given("User is on the main page")
    public void user_is_on_the_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web"));
        assertEquals(Driver.getDriver().getTitle(),"YouTube");
    }

    @When("user search for last city game")
    public void user_search_for_last_city_game() {
    }
    @Then("user see last city game")
    public void user_see_last_city_game() {
    }
    @When("user click the last city game")
    public void user_click_the_last_city_game() {
    }
    @Then("user watch the last city game")
    public void user_watch_the_last_city_game() {
    }

}
