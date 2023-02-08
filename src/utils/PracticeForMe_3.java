package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PracticeForMe_3 {
    public static void main(String[] args) {
        System.setProperty("webdriwer.chrome.driver",
                "/Users/anastasiyaprudnikova/IdeaProjects/initial_selenium_project_5/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("q")).sendKeys("Tesla" + Keys.ENTER);
       String resultText = driver.findElement(By.id("result-stats")).getText();
//       String[] arr = resultText.split(" ");
//       long result = Long.parseLong(arr[1].replaceAll("[^0-9]", ""));
//       System.out.println(result > 0? "passed" : "failed");
        long result = Long.parseLong(resultText.substring(resultText.indexOf(" ")+1,
                        resultText.indexOf("results")-1).replace(",", ""));
        System.out.println(result > 0 ? "passed" : "failed");


        driver.quit();
    }
}
