package StepDefinitions;

import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class HomePage_Steps {
WebDriver driver;
    @Given("usr should able to hover over")
    public void usr_should_able_to_hover_over() throws IOException {
       Pages.HomePage usr=new Pages.HomePage();
       usr.mouseOver();
    }
    @Then("usr should able to scroll up and down")
    public void usr_should_able_to_scroll_up_and_down() {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        //Scroll down
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        //scroll up
        js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
    }
    @When("usr clicks on {string}")
    public void usr_clicks_on(String string) throws IOException {
        Pages.HomePage usr=new Pages.HomePage();
        usr.clickOnSignUp();
    }
    @Then("usr land on Sign Up page")
    public void usr_land_on_Sign_Up_page() throws IOException {
        Pages.HomePage homepage= new Pages.HomePage();
        homepage.clickOnLogin();
        String title=driver.getTitle();
        Assert.assertEquals(title, "Podium.com");
    }
}


