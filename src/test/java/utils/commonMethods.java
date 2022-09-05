package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.pageInitializers;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class commonMethods extends pageInitializers {

    public static WebDriver driver;

    public static void openBrowserAndLaunchApplication(){
        configReader.readProperties(constants.CONFIGURATION_FILEPATH);
        String browserName = configReader.getPropertyValue("browser");
        //cross browser testing
        switch (browserName){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("Invalid browser name");
        }
        String url = configReader.getPropertyValue("url");
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(constants.IMPLICIT_WAIT,TimeUnit.SECONDS);
//intialize the page initializers
        initializePageObjects();

    }

    public static void closeBrowser(){

        driver.quit();
    }

    //it will return 20 sec wait
    public static WebDriverWait getWait(){
        WebDriverWait wait = new WebDriverWait(driver, constants.EXPLICIT_WAIT);
        return wait;
    }
    //it will wait till the time element becomes clickable
    public static void waitForClickability(WebElement element){
        getWait().until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void click(WebElement element){
        waitForClickability(element);
        element.click();
    }

    public static void sendText(WebElement element, String textToSend){
        element.clear();
        element.sendKeys(textToSend);
    }

    public static byte[] takeScreenshot(String fileName){
        TakesScreenshot ts = (TakesScreenshot) driver;
        byte[] picBytes =  ts.getScreenshotAs(OutputType.BYTES);
        File sourceFile = ts.getScreenshotAs(OutputType.FILE);

        //how to name the screenshot

        try {
            FileUtils.copyFile(sourceFile, new File(constants.SCREENSHOT_FILEPATH +
                    fileName + " " + getTimeStamp("yyyy-MM-dd-HH-mm-ss")+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return picBytes;
    }

    //to get the time in specific format so that we can add it in the name of screenshot
    public static String getTimeStamp(String pattern){
        Date date = new Date();
        //to format the date according to the choice of our own
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }
}
