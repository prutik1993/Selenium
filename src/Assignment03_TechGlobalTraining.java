import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.TechGlobalUtil;
import utils.Waiter;

import java.util.List;

public class Assignment03_TechGlobalTraining {
    public static void main(String[] args) {

        /*
        TEST CASE 1
        Go to https://techglobal-training.netlify.app/
        Select "Frontend Testing" from the "Practices" dropdown
        Select the "Xpath-CSS Locators" card
        Validate the Programming Languages list items below
        Java
        JavaScript
        c#
         */
        WebDriver driver = Driver.getDriver();

        TechGlobalUtil.getFrontEndTesting();
        Waiter.pause(2);

        TechGlobalUtil.clickOnElement(2);
        Waiter.pause(2);

        List<WebElement> languages = driver.findElements(By.xpath("(//li//ul)[1]/li"));
        String[] namesOfElements1 = {"Java","JavaScript","C#"};


        for (int i = 0; i < languages.size(); i++) {
            System.out.println(languages.get(i).isDisplayed() ?
                    "Element is displayed" : "Element isn't displayed");

            System.out.println(languages.get(i).getText().equals(namesOfElements1[i]) ?
                    "Text validation PASSED" : "Text validation FAILED");

            System.out.println("-------------------------");
        }
        /*
         TEST CASE 2
         Go to https://techglobal-training.netlify.app/
         Select "Frontend Testing" from the "Practices" dropdown
         Select the "Xpath-CSS Locators" card
         Validate the Automation Tools list items below
         Selenium WebDriver
         WebDriverIO
         Cypress
         Playwright
          */
        List<WebElement> automationTools = driver.findElements(By.xpath("(//li//ul)[2]/li"));
        String[] namesOfElements2 = {"Selenium WebDriver","WebDriverIO","Cypress","Playwright"};


        for (int i = 0; i < automationTools.size(); i++) {
            System.out.println(automationTools.get(i).isDisplayed() ?
                    "Element is displayed" : "Element isn't displayed");

            System.out.println(automationTools.get(i).getText().equals(namesOfElements2[i]) ?
                    "Text validation PASSED" : "Text validation FAILED");

            System.out.println("-------------------------");
        }

        Driver.quitDriver();
    }
}
