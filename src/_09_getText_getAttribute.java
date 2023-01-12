import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.Waiter;

public class _09_getText_getAttribute {
    public static void main(String[] args) {

        /*
        Go to https://www.techglobalschool.com/
        Scroll down to the bottom of the page

        Validate the Subscribe form
        Validate "Subscribe" heading2 with its text
        Validate "Stay up to date!" paragraph with its text
        Validate "Enter your first name" input box with its placeholder
        Validate "Enter your last name" input box with its placeholder
        Validate "Add your email" input box with its placeholder
        Validate "SUBSCRIBE" button with its text
         */

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.techglobalschool.com/");

        WebElement heading = driver.findElement(By.cssSelector("#comp-keehv7pd1>h2"));
        //WebElement heading = driver.findElement(By.id("comp-keehv7pd1"));
        WebElement text = driver.findElement(By.id("comp-keei0711"));
        WebElement firstName = driver.findElement(By.id("input_comp-khwayxk9"));
        WebElement lastName = driver.findElement(By.id("input_comp-khwaz4h2"));
        WebElement email = driver.findElement(By.id("input_comp-khwb0zsz"));
        WebElement subscribeButton = driver.findElement(By.cssSelector("#comp-khwayqh22>button"));

        System.out.println(heading.isDisplayed() ? "PASSED" : "FAILED");
        System.out.println(heading.getText());

        System.out.println(text.isDisplayed() ? "PASSED" : "FAILED");
        System.out.println(text.getText());

        System.out.println(firstName.isDisplayed() ? "PASSED" : "FAILED");
        //System.out.println(firstName.getAttribute("placeholder"));
        firstName.sendKeys("John");
        System.out.println(firstName.getAttribute("value"));


        System.out.println(lastName.isDisplayed() ? "PASSED" : "FAILED");
        //System.out.println(lastName.getAttribute("placeholder"));
        lastName.sendKeys("Doe");
        System.out.println(lastName.getAttribute("value"));


        System.out.println(email.isDisplayed() ? "PASSED" : "FAILED");
       // System.out.println(email.getAttribute("placeholder"));
        email.sendKeys("johndoe@gmail.com");
        System.out.println(email.getAttribute("value"));


        System.out.println(subscribeButton.isDisplayed() ? "PASSED" : "FAILED");
        System.out.println(subscribeButton.isEnabled() ? "PASSED" : "FAILED");
        System.out.println(subscribeButton.getText());



        //HOW TO VALIDATE STYLES
        System.out.println(subscribeButton.getCssValue("color"));
        System.out.println(subscribeButton.getCssValue("background-color"));
        System.out.println(subscribeButton.getCssValue("font-size"));
        System.out.println(subscribeButton.getCssValue("font-family"));
        System.out.println(subscribeButton.getCssValue("margin"));

        System.out.println(subscribeButton.getTagName());


        Driver.quitDriver();



    }
}
