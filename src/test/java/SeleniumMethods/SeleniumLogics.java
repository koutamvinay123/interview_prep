package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumLogics {
    public static void main(String[] args) {

        WebDriver wb = new ChromeDriver();
        Select country = new Select(wb.findElement(By.id("country")));
        country.selectByVisibleText("India");
        wb.switchTo().frame(1);
        Actions a = new Actions(wb);
        a.keyDown(Keys.SHIFT).sendKeys("test").keyDown(Keys.ENTER).perform();
        //input[contains(text(),'test']
        //input[starts-with(text(),'you']
    }
}
