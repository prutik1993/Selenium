package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private static WebDriver driver;

    private Driver(){};

    public static WebDriver getDriver(){
        if(driver == null){
            System.setProperty("webdriver.chrome.driver", // sets the driver to Java system
                    "/Users/anastasiyaprudnikova/IdeaProjects/initial_selenium_project_5/chromedriver"); // location on your desktop
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }


    public static void quitDriver(){
        if(driver != null){
            driver.manage().deleteAllCookies(); // for proper clean up
            driver.quit();
        }
    }
}
