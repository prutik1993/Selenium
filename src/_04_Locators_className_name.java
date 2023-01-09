import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.Waiter;

import java.util.ArrayList;
import java.util.Arrays;

public class _04_Locators_className_name {
    public static void main(String[] args) {
        /*
        TEST CASE
        Go to https://techglobal-training.netlify.app/
        Select "Frontend Testing" from the "Practices" dropdown
        Select the "Locators" card
        Validate the "Kiwi", "Orange" and "Grapes" items are displayed
        */

         try{
             // 1. Set up
             WebDriver driver = Driver.getDriver();

             // 2. Action
             driver.get("https://techglobal-training.netlify.app/");
             Waiter.pause(2);

             driver.findElement(By.id("dropdown-button")).click();
             Waiter.pause(2);

             driver.findElement(By.id("frontend-option")).click();
             Waiter.pause(2);

             driver.findElement(By.id("card-1")).click();
             Waiter.pause(2);

             WebElement kiwiItem = driver.findElement(By.id("item_kiwi"));
             WebElement orangeItem = driver.findElement(By.name("item_orange"));
             WebElement grapesItem = driver.findElement(By.className("item_grapes"));

             if(kiwiItem.isDisplayed()) System.out.println("Kiwi validation PASSED");
             else System.out.println("Kiwi validation FAILED");

             if(orangeItem.isDisplayed()) System.out.println("Orange validation PASSED");
             else System.out.println("Orange validation FAILED");

             if(grapesItem.isDisplayed()) System.out.println("Grapes validation PASSED");
             else System.out.println("Grapes validation FAILED");

         }catch(Exception e){
             System.out.println("Test FAILED due to: " + e.getMessage());

        }finally {
             // 3. Teardown
             Driver.quitDriver();
         }








    }
}
