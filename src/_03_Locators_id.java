import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_Locators_id {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", // this line sets the driver to Java system
                "/Users/anastasiyaprudnikova/IdeaProjects/initial_selenium_project_5/chromedriver");

        WebDriver driver = new ChromeDriver(); // initialized new chrome webdriver

        driver.manage().window().maximize();

        driver.get("https://techglobal-training.netlify.app/"); // this line will navigate us to specified web application
        Thread.sleep(2000);

        // locate the logo and validate if it is displayed
        WebElement logo = driver.findElement(By.id("logo"));
        if(logo.isDisplayed()) System.out.println("Logo validation PASSED");
        else System.out.println("Logo validation FAILED");

        driver.quit();
    }
}
