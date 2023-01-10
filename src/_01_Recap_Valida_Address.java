import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.Waiter;

import java.util.List;

public class _01_Recap_Valida_Address {
    public static void main(String[] args) {

        /*
        TEST CASE 1
         Go to https://techglobal-training.netlify.app/
         Validate the address in the footer is displayed and text is "2860 S River Rd Suite 350, Des Plaines IL 60018"
         Validate the copyright in the footer is displayed and text is "© 2023 TechGlobal - All Rights Reserved"
         */

        WebDriver driver = Driver.getDriver();

        driver.get("https://techglobal-training.netlify.app/");

//        WebElement address = driver.findElement(By.cssSelector("div[class='has-text-centered'"));
//        if(address.isDisplayed()) System.out.println("Address validation PASSED");
//        else System.out.println("Address validation FAILED");

       List<WebElement> elements = driver.findElements(By.xpath("//footer[@class='Footer_footer__kXlYa']//p"));

       String[] actualText = {"2860 S River Rd Suite 350, Des Plaines IL 60018","© 2023 TechGlobal - All Rights Reserved"};

        for (int i = 0; i < elements.size(); i++) {
            if(elements.get(i).getText().equals(actualText[i])) System.out.println("PASSED");
            else System.out.println("FAILED");
        }

        // Validate both the instagram and facebook items are displayed and enabled

//        WebElement facebook = driver.findElement(By.id("Footer_facebook__UiT2a"));
//        if(facebook.isDisplayed()) System.out.println("PASSED");
//        else System.out.println("FAILED");
//
//        WebElement instagram = driver.findElement(By.id("Footer_instagram__0NXVy"));
//        if(instagram.isDisplayed()) System.out.println("PASSED");
//        else System.out.println("FAILED");

        List<WebElement> elements1 = driver.findElements(By.xpath("//div[@class='Footer_socials__7h4n1']"));
        for (int i = 0; i < elements1.size(); i++) {
            if(elements1.get(i).isDisplayed() && elements1.get(i).isEnabled())
                System.out.println("PASSED");
            else System.out.println("FAILED");
        }



        Driver.quitDriver();
    }
}
