package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Base;

import java.io.IOException;

public class HomePage extends Base{

    public HomePage() throws IOException {


        PageFactory.initElements(driver, this);

    }
    Actions action = new Actions(driver);
    JavascriptExecutor js = ((JavascriptExecutor) driver);

    @FindBy(xpath="//a[contains(text(),'Login')]")
    WebElement loginLink;
    @FindBy(xpath="//a[contains(text(),'Sign Up')]")
    WebElement signUp;
    @FindBy(xpath="//a[contains(text(),'Pricing')]")
    WebElement pricing;
    @FindBy(xpath="//span[.='Products']")
    WebElement products;
    @FindBy(linkText = "Get Started")
    WebElement getSignUp;

    public void clickOnLogin() {
        loginLink.click();
    }
    public void clickOnSignUp() {
        getSignUp.click();
    }
    public void clickOnPricing() { pricing.click(); }

    public void mouseOver() {
        action.moveToElement(products).click().build().perform();
    }


}


