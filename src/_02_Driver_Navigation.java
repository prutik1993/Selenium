import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_Driver_Navigation {
    public static void main(String[] args) {
     /*
      Exercise
       1. Go to https://www.techglobalschool.com
       2. Refresh the page
       3. Navigate to https://www.amazon.com/
       4. Navigate back to TechGlobal web site
       5. Navigate forward Amazon web site
       6. Validate the URL of the page
       7. Validate the title of the page

       EXPECTED RESULT:
       URL  = https://www.amazon.com/
       Title = Amazon.com. Spend less. Smile more.
      */

        System.setProperty("webdriver.chrome.driver", "/Users/anastasiyaprudnikova/IdeaProjects/initial_selenium_project_5/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.techglobalschool.com");
        driver.navigate().refresh();

        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().forward();

        if(driver.getCurrentUrl().equals("https://www.amazon.com/")) System.out.println("URL Validation PASSED");
        else System.out.println("URL Validation FAILED");

        if(driver.getTitle().equals("Amazon.com. Spend less. Smile more.")) System.out.println("Title Validation PASSED");
        else System.out.println("Title Validation FAILED");

        driver.quit();


    }
}
