package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Base {

        public WebDriver driver;
        public static int IMPLICIT_WAIT =20;
        public static int PAYLOAD_TIME =40;
        public Properties prop;

        public void init() throws IOException {
            FileInputStream fis =new FileInputStream("resources/config.properties");
            prop=new Properties();
            prop.load(fis);
            String browser=prop.getProperty("browser");
            if(browser.equalsIgnoreCase("firefox")) {
                System.setProperty("webserver.chrome.driver","/Users/zhibeksabyrova/Downloads/geckodriver.exe");
                driver=new ChromeDriver();
            }else if(browser.equalsIgnoreCase("edge")) {
                System.setProperty("webserver.edge.driver","/Users/zhibeksabyrova/Downloads/MicrosoftWebDriver.exe");
                driver=new EdgeDriver();
            }else if(browser.equalsIgnoreCase("chrome")) {
                System.setProperty("webserver.firefox.driver","/Users/zhibeksabyrova/Downloads/chromedriver.exe");
                driver=new FirefoxDriver();
            }

            driver.get(prop.getProperty("url"));
            driver.manage().timeouts().pageLoadTimeout(PAYLOAD_TIME, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
            driver.manage().deleteAllCookies();

        }
        public void getScreenShot() throws IOException {
            File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            File dest=new File("");
            FileUtils.copyFile(src, dest);

        }
        public void tearDown() {
            driver.close();
            driver.quit();
        }

    }
