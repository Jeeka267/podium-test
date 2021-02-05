package Pages;

import Utilities.Base;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class CareersPage extends Base {

    public CareersPage() throws IOException {

        PageFactory.initElements(driver, this);

    }
    Actions action = new Actions(driver);
    JavascriptExecutor js = ((JavascriptExecutor) driver);

    @FindBy(xpath ="/html/body/div[14]/footer/section/div[1]/div[2]/div[3]/a[3]")
    WebElement careersLink;
    @FindBy(xpath="//a[contains(text(),'Sign Up')]")
    WebElement signUp;
    @FindBy(xpath="//a[contains(text(),'Pricing')]")
    WebElement pricing;
    @FindBy(xpath="//span[.='Products']")
    WebElement products;
    @FindBy(linkText = "Get Started")
    WebElement getSignUp;

    public void clickOnLogin() {
        careersLink.click(); //title of the careers Page ->Podium Jobs - Work With Us | Podium
    }
    public void clickOnSignUp() {
        getSignUp.click();
    }

}