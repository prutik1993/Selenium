import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.TechGlobalUtil;
import utils.Waiter;

public class _06_Locators_linkText_partialLinkText {
    public static void main(String[] args) {

        try{
            WebDriver driver = Driver.getDriver();

            TechGlobalUtil.getFrontEndTesting();

            driver.findElement(By.id("card-1")).click();
            Waiter.pause(2);

            WebElement redApple = driver.findElement(By.linkText("Red Apple"));
            WebElement greenApple = driver.findElement(By.linkText("Green Apple"));
            WebElement pineApple = driver.findElement(By.linkText("Pineapple"));

            if(redApple.isDisplayed()) System.out.println("Red Apple validation PASSED");
            else System.out.println("Red Apple validation FAILED");
            System.out.println(redApple.isEnabled());
            System.out.println(redApple.getText());

            if(greenApple.isDisplayed()) System.out.println("Green Apple text validation PASSED");
            else System.out.println("Green Apple text validation FAILED");
            System.out.println(greenApple.isEnabled());
            System.out.println(greenApple.getText());

            if(pineApple.isDisplayed()) System.out.println("Pineapple text validation PASSED");
            else System.out.println("Pineapple text validation FAILED");
            System.out.println(pineApple.isEnabled());
            System.out.println(pineApple.getText());

        }catch(Exception e){
            System.out.println("Test FAILED due to: " + e.getMessage());

        }finally {
            // 3. Teardown
            Driver.quitDriver();
        }
    }
}
