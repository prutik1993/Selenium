import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;
import utils.TechGlobalUtil;
import utils.Waiter;

public class _11_ChildElements_Index {
    public static void main(String[] args) {
      /*
      TEST CASE
      Go to https://techglobal-training.netlify.app/
      Select "Frontend Testing" from the "Practices" dropdown
      Select the "Xpath-CSS Locators" card
      Validate the headers below
      Programming Languages
      Automation Tools
       */

        WebDriver driver = Driver.getDriver();

        TechGlobalUtil.getFrontEndTesting();

        driver.findElement(By.id("card-2")).click();
        Waiter.pause(2);

        System.out.println(driver.findElement(By.xpath("(//h3[@class='Xpath_subheader__VOtsU'])[2]")).isDisplayed());

        Driver.quitDriver();

    }
}
