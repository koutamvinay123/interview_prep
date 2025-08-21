package CGI;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.io.FileHandler;

public class Waits {
    public static void main(String[] args) {
// Automatically downloads & sets up ChromeDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        driver.findElement(By.xpath("//button[@class='a-button-text']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        System.out.println(driver.getCurrentUrl());
        WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
         WebElement e =   w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-us icp-nav-flag-lop']")));
        FluentWait<WebDriver> f = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10))
                        .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
        f.until(webDriver -> webDriver.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-us icp-nav-flag-lop']")));
         System.out.println(e.getText());
        System.out.println(e.getAttribute("aria-label"));
        TakesScreenshot ts = (TakesScreenshot) driver;
        File f1 = ts.getScreenshotAs(OutputType.FILE);
        File f2 = new File("C:\\Selenium\\ss.png");
        try {
            FileHandler.copy(f1, f2);
        }
        catch(IOException i0){

        }
        driver.quit();
    }
}
