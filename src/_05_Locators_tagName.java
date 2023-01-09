import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.TechGlobalUtil;
import utils.Waiter;

public class _05_Locators_tagName {
    public static void main(String[] args) {
        try{
            WebDriver driver = Driver.getDriver();

            TechGlobalUtil.getFrontEndTesting();

            driver.findElement(By.id("card-1")).click();
            Waiter.pause(2);

            WebElement element = driver.findElement(By.id("main_heading"));

            if(element.isDisplayed()) System.out.println("Locators validation PASSED");
            else System.out.println("Locators validation FAILED");

            if(element.getText().equals("Locators")) System.out.println("Locators text validation PASSED");
            else System.out.println("Locators text validation FAILED");

        }catch(Exception e){
            System.out.println("Test FAILED due to: " + e.getMessage());

        }finally {
            // 3. Teardown
            Driver.quitDriver();
        }
    }
}
