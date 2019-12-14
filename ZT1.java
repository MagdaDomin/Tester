import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ZT1 {

    private WebDriver driver;

    @BeforeEach
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\radlo\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        driver.manage().window().maximize();
    }

    @Test
    public void Registration() {
        WebElement registration=driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
        registration.click();
        registration.sendKeys("radlowski20@wp.pl");
        driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]")).click();
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/h3")));
        driver.findElement(By.xpath("//*[@id=\"id_gender1\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).click();
//        registration.sendKeys("Rafal");
    }

    @Test
    public void SecondRegistration() {
        WebElement secondregistration=driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
        secondregistration.click();
        secondregistration.sendKeys("magda.domin@vp.pl");
        driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"create_account_error\"]"));

    }

    @Test
    public void Password() {
        WebElement password=driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
        password.click();
        password.sendKeys("magda.domin@vp.pl");
        driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"create_account_error\"]"));
        driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/p[1]/a")).click();
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"form_forgotpassword\"]/fieldset/div")));
        driver.findElement(By.xpath("//*[@id=\"email\"]")).click();
//        password.sendKeys("magda.domin@vp.pl");
//        driver.findElement(By.xpath("//*[@id=\"form_forgotpassword\"]/fieldset/p/button")).click();
//        driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/p"));

    }

    @AfterEach
    public void after() {
        driver.quit();
    }
}
