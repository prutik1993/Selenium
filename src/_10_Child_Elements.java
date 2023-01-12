import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import sun.font.FontRunIterator;
import utils.Driver;

import java.util.List;

public class _10_Child_Elements {
    public static void main(String[] args) {
        /*
        Go to https://www.techglobalschool.com/
        Validate the header items below
        HOME
        INTRO SESSION
        APPLY NOW
        COURSES
        CONTACT
         */

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.techglobalschool.com/");

        List<WebElement> headerElements = driver.findElements(By.cssSelector("#comp-kuiqjiulitemsContainer a"));
       // driver.findElement(By.xpath("//ul[@id='comp-kuiqjiulitemsContainer'] //a"));

        String[] expectedText = {"HOME", "INTRO SESSION", "APPLY NOW", "COURSES", "CONTACT"};

        for (int i = 0; i < headerElements.size(); i++) {
            System.out.println(headerElements.get(i).getText().equals(expectedText[i]));
        }

//        for (WebElement headerElement : headerElements) {
//            System.out.println(headerElement.getText());
//            System.out.println(headerElement.isDisplayed());
//            System.out.println(headerElement.isEnabled());
//        }

        Driver.quitDriver();
    }
}
