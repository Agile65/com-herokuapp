package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class HerokuappMultiBrowserTest {

    // static variable declaration and assigning values to it
    static String baseUrl="http://the-internet.herokuapp.com/login";
    static String browser="Firefox";
    static WebDriver driver;

    public static void main(String[] args) {

        //  1. Set up the browser
        if(browser.equalsIgnoreCase("Chrome")){
            driver=new ChromeDriver();
        }else if(browser.equalsIgnoreCase("Edge")){
            driver=new EdgeDriver();
        }else if(browser.equalsIgnoreCase("FireFox")){
            driver=new FirefoxDriver();
        }else{
            System.out.println("Wrong browser name");
        }

        //  2. Open the Url into Browser
        driver.get(baseUrl);
        //  Maximise the Browser
        driver.manage().window().maximize();
        //  We give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //  3. Print the title of the page
        System.out.println(driver.getTitle());

        //  4. Print the currant Url
        System.out.println(driver.getCurrentUrl());

        //  5. Print the page source
        System.out.println(driver.getPageSource());

        //  6. Enter the email to the email field after finding the element
        driver.findElement(By.id("username")).sendKeys("prime1234@gmail.com");

        //  7. Enter the password to the password field after finding the element
        driver.findElement(By.name("password")).sendKeys("1234wq");

        //  8. Close the Browser
        driver.close();
    }
}
