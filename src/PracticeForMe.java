import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class PracticeForMe {
    public static void main(String[] args) {
        /*
                WebDriver methods
        - maximize() vs fullscreen() -> covers the screen
        - get() vs navigate().to() -> directs user to the given url
        - close() vs quit() -> closes the tab or the window
        - getTitle() vs getCurrentURL() -> gets the title or URL
                  NAVIGATIONS
        navigate().to(url) -> directs user to the given url
        navigate().back() -> navigates user to previous page
        navigate().forward() -> navigates user to forward
        navigate().refresh() -> refresh the page
         */

        System.setProperty("webdriver.chrome.driver", // this line sets the driver to Java system
                "/Users/anastasiyaprudnikova/IdeaProjects/initial_selenium_project_5/chromedriver");

        WebDriver driver = new ChromeDriver(); // initialized new safari webdriver

        driver.get("https://elixirandersonville.com"); // this line will navigate us to specified web application


        driver.manage().window().maximize(); // opens the whole screen in webdriver The browser's menu bar is visible
        //driver.manage().window().fullscreen(); // opens the whole screen in webdriver The browser's menu bar is not visible
        driver.navigate().refresh();
        driver.navigate().to("https://www.youtube.com/");
        driver.navigate().back();
        driver.navigate().forward();


        driver.quit(); // this line exits the driver, closing every associated windows, tabs, pop ups, etc.
       //driver.close(); // exit the current window only


    }
}
