import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Driver;
import utils.GetGoogle;

import java.util.List;

public class PracticeForMe_02 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        GetGoogle.getGoogle();



        List<WebElement> buttons = driver.findElements(By.xpath("(//div/center)[2]/input"));
        for (int i = 0; i < buttons.size(); i++) {
            System.out.println(buttons.get(i).isDisplayed() ? "passed" : "failed");
        }

       // System.out.println(driver.findElement(By.id("gbqfbb")).isDisplayed() ? "Passed" : "Failed");

        List<WebElement> elements = driver.findElements(By.cssSelector(".iTjxkf>a"));
        for (int i = 0; i < elements.size(); i++) {
            System.out.println(elements.get(i).isDisplayed());

        }

        System.out.println(driver.findElement(By.xpath("//a[@class='gb_m'][1]")).isDisplayed());
//        System.out.println(driver.findElement(By.xpath("(//a[@class='MV3Tnb'])[1]")).isDisplayed());
//        System.out.println(driver.findElement(By.className("lnXdpd")).isDisplayed());
//        System.out.println(driver.findElement(By.className("goxjub")).isDisplayed());
//        System.out.println(driver.findElement(By.className("ktLKi")).getText());




        Driver.quitDriver();
    }
}
