import net.bytebuddy.agent.builder.AgentBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locators1 {
WebDriver driver;
    @Test
    public void Test2() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mpm26\\eclipse-workspace\\" +
                "Selenium1\\src\\main\\resources\\BrowserDrivers\\" +
                "chromedriver.exe\\chromedriver.exe");                      //  setting path for browser

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.whiteboxqa.com/");

        driver.manage().window().maximize();
       driver.findElement(By.id("loginButton")).click();

     driver.findElement(By.id("loginbyfb")).isEnabled();   //.isDisplayed();


        driver.findElement(By.className("form-control")).sendKeys("Pom824@yahoo.com");

        driver.findElement(By.name("pwd")).sendKeys("Mahi@2608");

      //  driver.findElement(By.className("pwd")).clear();   //clear passwrd by using clear()
        driver.findElement(By.id("login")).click();

    }
}
