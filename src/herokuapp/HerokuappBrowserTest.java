package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**Project-3 - Project Name: com-herokuapp
 * BaseUrl = http://the-internet.herokuapp.com/login
 */
public class HerokuappBrowserTest {
    public static void main(String[] args) {

        String baseUrl="http://the-internet.herokuapp.com/login";
        //  1. Set up the Chrome browser
        WebDriver driver=new ChromeDriver();

        //  2. Open the Url into Browser
        driver.get(baseUrl);
        //  Maximise the Browser
        driver.manage().window().maximize();
        //  We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //  3. Print the title of the page
        System.out.println(driver.getTitle());

        //  4. Print the currant Url
        System.out.println(driver.getCurrentUrl());

        //  5. Print the page source
        System.out.println(driver.getPageSource());

        //  6. Enter email to the email field after finding the element
        driver.findElement(By.id("username")).sendKeys("prime1234@gmail.com");

        //  7. Enter password to the password field after finding the element
        driver.findElement(By.name("password")).sendKeys("as1234");

        //  8. Close the Browser
        driver.close();
    }
}
