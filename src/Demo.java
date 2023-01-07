import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/anastasiyaprudnikova/IdeaProjects/initial_selenium_project_5/chromedriver");

        WebDriver driver = new ChromeDriver(); // instantiating ChromDriver

        driver.manage().window().fullscreen(); // open a full window

        driver.get("https://www.google.com/"); // novigate to our url

        String title = driver.getTitle();
        System.out.println(title);

        driver.quit(); // quit the driver instance



    }
}
