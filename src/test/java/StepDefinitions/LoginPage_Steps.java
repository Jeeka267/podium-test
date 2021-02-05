package StepDefinitions;

import Pages.HomePage;
import Pages.LoginPage;
import Utilities.Base;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class LoginPage_Steps extends Base {

    @Before()
    public void initlization() throws IOException {
        init();
    }
    @Given("user is already on login page")
    public void user_is_already_on_login_page() throws IOException {
        HomePage homepage= new HomePage();
        homepage.clickOnLogin();
        String title=driver.getTitle();
        Assert.assertEquals(title, "Podium.com");
    }

    @Then("user enters username and password")
    public void user_enters_username() throws IOException {
        LoginPage loginpage=new LoginPage();
        loginpage.enterUsername();
        loginpage.enterPassword();

    }

    @Then("user clicks login button")
    public void user_clicks_login_button() throws IOException {
        LoginPage loginpage=new LoginPage();
        loginpage.clickOnLoginBtn();
    }
}
