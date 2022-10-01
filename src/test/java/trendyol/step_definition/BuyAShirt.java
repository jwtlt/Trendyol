package trendyol.step_definition;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import trendyol.pages.*;
import trendyol.utilities.*;

import static trendyol.pages.Base_Page.*;
import static org.junit.jupiter.api.Assertions.*;

public class BuyAShirt {

    Base_Page base_page = new Base_Page();

    @Given("User is on the main page")
    public void user_is_on_the_main_page() {
        Driver.getDriver().get("https://www.trendyol.com");
        assertEquals(Driver.getDriver().getTitle(),"En Trend Ürünler Türkiye'nin Online Alışveriş Sitesi Trendyol'da");
    }
    @When("User searches for a shirt")
    public void user_searches_for_a_shirt() {
        base_page.searchBox.sendKeys("shirt" + Keys.ENTER);
    }
    @Then("User lands on the page full of shirts")
    public void user_lands_on_the_page_full_of_shirts() {
    }
    @Then("User picks second shirt on the page")
    public void user_picks_second_shirt_on_the_page() {

    }
    @Then("User picks small size")
    public void user_picks_small_size() {

    }
    @Then("User clicks {string} button")
    public void user_clicks_button(String string) {

    }
    @Then("User transferred the login page")
    public void user_transferred_the_login_page() {

    }

}
