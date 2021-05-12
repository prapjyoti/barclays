package barclaystest;
/*
Edge Browser open successfully with given url
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class EdgeBrowserTest {
    public static void main(String[] args) {
        String baseUrl= "https://www.barclays.co.uk/";//variable declare
        //set the property fro browser and the copy the path
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();//obj declare
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);//called the url
        driver.close();//close the driver for browser
    }
}
