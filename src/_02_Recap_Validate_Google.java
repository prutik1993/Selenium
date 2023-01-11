import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.Waiter;

public class _02_Recap_Validate_Google {
    public static void main(String[] args) {
        /*
        TEST CASE 3
       Go to https://www.google.com/
       Validate the page title is "Google"
       Validate the page url is "https://www.google.com/"
         */

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.google.com/");

        if(driver.getTitle().equals("Google"))System.out.println("PASSED");
        else System.out.println("FAILED");

        if(driver.getCurrentUrl().equals("https://www.google.com/")) System.out.println("PASSED");
        else System.out.println("FAILED");

        /*
        EST CASE 4
        Go to https://www.google.com/
        Enter "Software Engineer in Test" to search input box
        Click the search button
        Validate the first result contains the text "Software Engineer in Test"
         */

        WebElement searchInput = driver.findElement(By.className("gLFyf"));
        WebElement searchButton = driver.findElement(By.name("btnK"));

        searchInput.sendKeys("Software Engineer in Test");
        searchButton.click();

        System.out.println(driver.findElement(By.xpath("(//div[@class='yuRUbf'])[1]")).getText().contains("Software Engineer in Test")
                        ? "Validation PASSED" : "Validation FAILED");


//        if(driver.findElement(By.xpath("(//div[@class='yuRUbf'])[1]")).getText().contains("Software Engineer in Test"))
//            System.out.println("PASSED");
//        else System.out.println("FAILED");






        driver.quit();
    }
}
