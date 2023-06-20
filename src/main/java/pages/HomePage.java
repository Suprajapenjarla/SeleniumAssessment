package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver = null;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void login() {
        String Loc = "//div[@class='tBJ dyH iFc sAJ xnr tg7 H2s']";
        WebElement ele = this.driver.findElement(By.xpath(Loc));
        ele.click();
    }

    public void email(String value) {
        String Loc = "(//input[@id='email'])";
        WebElement ele = this.driver.findElement(By.xpath(Loc));
        ele.sendKeys(value);
    }

    public void password(String value) {
        String Loc = "///input[@type='password']";
        ;
        WebElement ele = this.driver.findElement(By.xpath(Loc));
        ele.sendKeys(value);
    }

    public void clickLogin() {
        String Loc = "(//div[@class='zI7 iyn Hsu'])";
        WebElement ele = this.driver.findElement(By.xpath(Loc));
        ele.click();
    }

    public void clickProfile() {
        String Loc = "(//div[@class='INd XiG zI7 iyn Hsu'])";

        WebElement ele = this.driver.findElement(By.xpath(Loc));
        ele.click();
    }

    public void clickEditProfile() {
        String Loc = "(//div[@class='xuA']/button/div/div[@class='tBJ dyH iFc sAJ O2T tg7 H2s'])";
        WebElement ele = this.driver.findElement(By.xpath(Loc));
        ele.click();

    }

    public void clickPersonalInfo(){
        String Loc ="(//div[@class='tBJ dyH iFc sAJ O2T zDA IZT H2s'])";
        WebElement ele = this.driver.findElement(By.xpath(Loc));
        ele.click();
    }
    public void clickClear() {

        String Loc = "(//input[@id='birthdate']/@value)";
        WebElement ele = this.driver.findElement(By.xpath(Loc));
        ele.click();
    }

    public void clickReset() {
        String Loc = "(//div[@class='tBJ dyH iFc sAJ xnr tg7 H2s'])";
        WebElement ele = this.driver.findElement(By.xpath(Loc));
        ele.click();
    }
    public void clickClear1() {

        String Loc = "(//input[@id='last_name'])";
        WebElement ele = this.driver.findElement(By.xpath(Loc));
        ele.click();
    }
    public void clickSave() {
        String Loc = "(//div[@class='tBJ dyH iFc sAJ xnr tg7 H2s'])";
        WebElement ele = this.driver.findElement(By.xpath(Loc));
        ele.click();
    }






}
