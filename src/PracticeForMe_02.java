import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Driver;
import utils.GetGoogle;

public class PracticeForMe_02 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        GetGoogle.getGoogle();



        Driver.quitDriver();
    }
}
