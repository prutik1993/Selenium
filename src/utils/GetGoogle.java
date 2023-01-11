package utils;

import org.openqa.selenium.WebDriver;

public class GetGoogle {

    public static void getGoogle(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.google.com/");
    }
}
