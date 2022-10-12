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

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
    Base_Page base_page = new Base_Page();

    @Given("User is on the main page")
    public void user_is_on_the_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web"));
        assertEquals(Driver.getDriver().getTitle(),"YouTube");
    }

    @When("user search for last city game")
    public void user_search_for_last_city_game() {
        base_page.searchBox.sendKeys("last man city game");
        base_page.searchIcon.click();
    }

    @Then("user see last city game")
    public void user_see_last_city_game() {
        sleep(5);
       List<WebElement> matches = Driver.getDriver().findElements(By.xpath("//*[@id=\"metadata-line\"]/span[2]"));
         for(WebElement each: matches){
             System.out.println("each.getText() = " + each.getText());
             if(each.getText().contains("hours") || each.getText().contains("day") || each.getText().contains("days")){
                 each.click();
             }
             else {
                 continue;
             }
         }
    }
    @When("user click the last city game")
    public void user_click_the_last_city_game() {
        wait.until(ExpectedConditions.visibilityOf(base_page.skipButton));
        base_page.skipButton.click();
    }
    @Then("user watch the last city game")
    public void user_watch_the_last_city_game() {
    }

}
