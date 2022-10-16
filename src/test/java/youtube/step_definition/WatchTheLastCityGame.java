package youtube.step_definition;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import youtube.pages.*;
import youtube.utilities.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static youtube.utilities.BrowserUtilities.*;

public class WatchTheLastCityGame {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    Base_Page base_page = new Base_Page();

    @Given("User is on the main page")
    public void user_is_on_the_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web"));
        assertEquals(Driver.getDriver().getTitle(), "YouTube");
    }

    @When("user search for last city games")
    public void user_search_for_last_city_games() {
        base_page.searchBox.sendKeys("last man city game");
        base_page.searchIcon.click();
        wait.until(ExpectedConditions.titleIs("last man city game - YouTube"));
        assertEquals("last man city game - YouTube", Driver.getDriver().getTitle());
    }

    @Then("user see last city games")
    public void user_see_last_city_games() {
        List<WebElement> matchTitles = Driver.getDriver().findElements(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string"));
        int count = 0;
        for (WebElement each : matchTitles) {
            if (each.getText().length() > 5) {
                System.out.println("matchTitle = " + each.getText());
                assertTrue(each.getText().toLowerCase().contains("city"));
                count += 1;
                if (count == 1) {
                    return;
                }
            }
        }
    }

    @When("user click one of the last city game")
    public void user_click_one_of_the_last_city_game() {
        List<WebElement> matchesDates = Driver.getDriver().findElements(By.xpath("//*[@id=\"metadata-line\"]/span[2]"));
        for (WebElement each : matchesDates) {
            if (each.getText().length() > 5 && each.getText().contains("hours") || each.getText().contains("day") || each.getText().contains("days")) {
                System.out.println("match date = " + each.getText());
                wait.until(ExpectedConditions.elementToBeClickable(each));
                each.click();
            }
        }
        assertTrue(Driver.getDriver().getTitle().toLowerCase().contains("city"));
    }

    @Then("user watch the city game")
    public void user_watch_the_city_game() {
        assertTrue(Driver.getDriver().getTitle().toLowerCase().contains("city"));
    }

}
