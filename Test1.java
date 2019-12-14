import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class Test1 {

    private WebDriver driver;

    @BeforeEach
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\radlo\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.elkjop.no/");
        driver.manage().window().maximize();
    }

    @Test
    public void ClickPost() throws InterruptedException {
        WebElement sekcja = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div[1]/ul/li[4]/div/a"));
        sekcja.click();
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"view-filter-navigation\"]/section/div[5]")));
        driver.findElement(By.xpath("//*[@id=\"view-filter-navigation\"]/section/div[6]"));
        driver.findElement(By.xpath("//*[@id=\"view-filter-navigation\"]/section/div[6]/div[3]")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"chat-bubble-chat-button\"]"))).click();


    }
    @AfterEach
    public void after() {
        driver.quit();
    }
}