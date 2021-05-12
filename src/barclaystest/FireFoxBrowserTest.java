package barclaystest;
/*

 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FireFoxBrowserTest {
    public static void main(String[] args) {
        String baseUrl= "https://www.barclays.co.uk/";//declare the variable
        //set the property for browser and copy the path
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();//obj created
        //use the method for windows(maximize) and timeout
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);//called the url
        driver.close();
    }
}
