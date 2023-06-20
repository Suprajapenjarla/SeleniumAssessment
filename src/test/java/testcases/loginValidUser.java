package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class loginValidUser {
    public static void main(String[] args) {
        String ChromeDriverPath = "C:\\Software\\chromedriver_ver113\\chromedriver\\chromedriver.exe";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        System.setProperty("webdriver.chrome.driver", "ChromeDriverPath");
        driver.get("https://www.pinterest.com/");
        driver.findElement(By.xpath("//div[@class='tBJ dyH iFc sAJ xnr tg7 H2s']")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pavanasupraja@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Chinni@259");
        driver.findElement(By.xpath("/div[@class='zI7 iyn Hsu']")).click();
    }
}
