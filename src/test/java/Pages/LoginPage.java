package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Base;

public class LoginPage extends Base{

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name="username")
    WebElement userName;
    @FindBy(xpath="//*[@id=\"signInButton\"]")
    WebElement nextBtn;
    @FindBy(xpath="//*[@id=\"passwordInput\"]")
    WebElement Password;
    @FindBy(xpath="//*[@id=\"signInButton\"]")
    WebElement btnLogin;


    public void  enterUsername() {
        String user=prop.getProperty("username");
        userName.sendKeys(user);
    }
    public void  enterPassword() {
        String pwd=prop.getProperty("password");
        userName.sendKeys(pwd);
    }
    public void clickOnLoginBtn() {
        btnLogin.click();
    }



}
