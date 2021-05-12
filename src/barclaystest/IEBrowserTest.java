package barclaystest;
/*
IE Browser open successfully with given url
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class IEBrowserTest {
    public static void main(String[] args) {
        String baseUrl ="https://www.barclays.co.uk/";//declare the variable
        //set the property for browser and copy the path
        System.setProperty("webdriver.ie.driver","drivers/IEDriverServer.exe");
        WebDriver driver= new InternetExplorerDriver();
        driver.manage().window().maximize();//method for maximize window
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.get(baseUrl);//called the url
        driver.close();//close the driver for browser
    }
}
