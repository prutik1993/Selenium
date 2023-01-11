import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class Practice {
    public static void main(String[] args) {

        try{
            WebDriver driver = Driver.getDriver();

            driver.get("https://www.facebook.com/");

            if(driver.getTitle().equals("Facebook - log in or sign up")) System.out.println("Title validation PASSED");
            else System.out.println("Title validation FAILED");

            if(driver.getCurrentUrl().equals("https://www.facebook.com/")) System.out.println("URL validation PASSED");
            else System.out.println("URL validation FAILED");

//            WebElement logo = driver.findElement(By.cssSelector("img[class='fb_logo _8ilh img']")); // if there a space it means here more classNames
//            if(logo.isDisplayed()) System.out.println("Logo validation PASSED");
//            else System.out.println("URL validation FAILED");

//            WebElement logo = driver.findElement(By.className("fb_logo"));
//            if(logo.isDisplayed()) System.out.println("Logo validation PASSED");
//            else System.out.println("URL validation FAILED");

            WebElement logo = driver.findElement(By.xpath("//img[contains(@class, '_8ilh')]"));
            if(logo.isDisplayed()) System.out.println("Logo validation PASSED");
            else System.out.println("URL validation FAILED");

            WebElement heading2 = driver.findElement(By.className("_8eso"));
            if(heading2.isDisplayed()) System.out.println("Heading2 validation PASSED");
            else System.out.println("Heading2 validation FAILED");

            WebElement emailBox = driver.findElement(By.id("email"));
            if(emailBox.isDisplayed()) System.out.println("Email Box validation PASSED");
            else System.out.println("Email Box validation FAILED");

            WebElement password = driver.findElement(By.id("pass"));
            if(password.isDisplayed()) System.out.println("Password validation PASSED");
            else System.out.println("Password Box validation FAILED");

            WebElement logInButton = driver.findElement(By.name("login")); // //button[contains(@class,'what contains')]
            if(logInButton.isDisplayed()) System.out.println("Log In Button validation PASSED");
            else System.out.println("Log In Button validation FAILED");

            if(logInButton.isEnabled()) System.out.println("Log In Button validation PASSED");
            else System.out.println("Log In Button validation FAILED");

            WebElement forgotPassword = driver.findElement(By.partialLinkText("Forgot"));
            if(forgotPassword.isDisplayed()) System.out.println("Forgot Password Link validation PASSED");
            else System.out.println("Forgot Password Link validation FAILED");

            WebElement createNewAccount = driver.findElement(By.cssSelector
                    ("a[class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
            if(createNewAccount.isDisplayed()) System.out.println("Create New Account validation PASSED");
            else System.out.println("Create New Account validation FAILED");
        }catch(Exception e){
            System.out.println("Here is an exception " + e.getMessage());
        }finally {
            Driver.quitDriver();
        }






    }
}
