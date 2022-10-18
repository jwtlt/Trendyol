package youtube.step_definition;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import youtube.pages.*;
import youtube.utilities.*;

import javax.swing.text.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SeeCommentsForAVideoGame {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    Base_Page base_page = new Base_Page();

    @When("User enter \"a game youtuber\" on the search box and hit the \"Enter\" button")
    public void user_enter_on_the_search_box() {
        base_page.searchBox.sendKeys("tarik");
        base_page.searchIcon.click();
    }

    @Then("User land on a page full of video about the youtuber")
    public void user_land_on_a_page_full_of_video_about_the_youtuber() {
        wait.until(ExpectedConditions.titleIs("tarik - YouTube"));
        assertTrue(Driver.getDriver().getTitle().equalsIgnoreCase("tarik - YouTube"));
    }

    @When("User clicks the first video")
    public void user_clicks_the_first_video() {
        WebElement gameVideo = Driver.getDriver().findElement(By.xpath("//ytd-item-section-renderer/div[3]/ytd-video-renderer[1]"));
        gameVideo.click();
        assertTrue(Driver.getDriver().getTitle().toLowerCase().contains("tarik"));
    }

    @Then("User can watch the video")
    public void user_can_watch_the_video() {
        BrowserUtilities.sleep(3);
        WebElement hashcode = Driver.getDriver().findElement(By.xpath("//*[@id=\"container\"]/yt-formatted-string/a[1]"));
        wait.until(ExpectedConditions.visibilityOf(hashcode));
        assertTrue(hashcode.isDisplayed());
    }

    @Then("User see the comments under the video")
    public void user_see_the_comments_under_the_video() {
        List<WebElement> comments = Driver.getDriver().findElements(By.xpath("//*[@id=\"content-text\"]"));
        for (WebElement each : comments) {
            System.out.println("comment = " + each.getText());
            assertTrue(each.getText().length() > 0);
        }
    }

}
