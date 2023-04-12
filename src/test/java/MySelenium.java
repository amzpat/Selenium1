import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MySelenium {

     @Test
      public void Test1() {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\mpm26\\eclipse-workspace\\" +
                    "Selenium1\\src\\main\\resources\\BrowserDrivers\\" +
                    "chromedriver.exe\\chromedriver.exe");

            //  setting path for browser

            WebDriver driver = new ChromeDriver();

            driver.get("http://www.whiteboxqa.com/");

            driver.manage().window().maximize();

          driver.navigate().to("https://www.youtube.com/");

            driver.navigate();
             String b = driver.getPageSource();
         System.out.println(b);

          //  String c = driver.getTitle();
        // System.out.println(c);


           driver.quit();
      }
}
