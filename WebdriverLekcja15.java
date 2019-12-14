import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WebdriverLekcja15 {

    public static void main(String[] args) {
        System.setProperty("webdriver, chromedriver", "C:\\Users\\radlo\\Downloads\\chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.onet.pl");
    }
}
