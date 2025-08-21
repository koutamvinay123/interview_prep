package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class LinksTest {
    public static void main(String[] args) throws IOException {
        WebDriver wb = new ChromeDriver();
        List<WebElement> li = wb.findElements(By.tagName("a"));
        List<String> st = new ArrayList<>();
        int checked = 0;
        for (WebElement a : li) {
            String s = a.getAttribute("href");
            if (s != null && !s.isEmpty()) {
                st.add(s);
            }
            HttpURLConnection c = (HttpURLConnection) new URL(s).openConnection();
            c.setRequestMethod("GET");
            c.connect();
            int get = c.getResponseCode();
           if(get>200){
               System.out.println("Not a broken link");
        }
           c.disconnect();
           checked++;
           if(checked==20){
               break;
            }
    }
    }
}
