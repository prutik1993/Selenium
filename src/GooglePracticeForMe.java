import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Waiter;

public class GooglePracticeForMe {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", // this line sets the driver to Java system
                "/Users/anastasiyaprudnikova/IdeaProjects/initial_selenium_project_5/chromedriver");

        WebDriver driver = new ChromeDriver(); //
        driver.get("https://www.google.com/");
        driver.findElement(By.className("gLFyf")).sendKeys("Tesla" + Keys.ENTER);
        Waiter.pause(2);
        driver.findElement(By.className("gLFyf"));

        Waiter.pause(2);

        driver.quit();
    }
}
