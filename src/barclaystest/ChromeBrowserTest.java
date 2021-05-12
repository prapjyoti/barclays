package barclaystest;
/*
Chrome Browser open successfully with given url
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeBrowserTest {

    public static void main(String[] args) {
        String baseUrl= "https://www.barclays.co.uk/";//variable declare
        //set the property for browser and copy the path
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();//obj declare
        //method use for maximize windows and time out
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        driver.get(baseUrl);
        //fetch the title
        String title= driver.getTitle();
        System.out.println(title);
        driver.close();
    }
}
