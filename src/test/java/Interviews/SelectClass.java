package Interviews;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
    public static void main(String[] args) {

        WebDriver wb = new ChromeDriver();
        Select country = new Select(wb.findElement(By.id("country")));
        country.selectByVisibleText("India");

    }
}