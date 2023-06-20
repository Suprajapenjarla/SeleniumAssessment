package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CreatingValidUser {
    public static void main(String[] args) {
        String ChromeDriverPath = "C:\\Software\\chromedriver_ver113\\chromedriver\\chromedriver.exe";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        System.setProperty("webdriver.chrome.driver", "ChromeDriverPath");
        driver.get("https://www.pinterest.com/");
        driver.findElement(By.xpath("//div[contains(text(),'Sign up')]")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pavanasupraja@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Chinni@259");
       driver.findElement(By.xpath("//input[@id='birthdate']")).sendKeys("18-02-2002");
        driver.findElement(By.xpath("//div[contains(text(), 'Continue')]")).click();
       driver.findElement(By.xpath("//div[contains(text(),'Next')]")).click();
    }
}




















