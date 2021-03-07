package controller;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ScriptBase {
    @Test
    public void init(){
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.quit();

    }
    @Test
    public void init2(){
        System.setProperty("webdriver.gecko.driver","./drivers/geckodriver");
        WebDriver driver= new FirefoxDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.quit();


    }
    @Test
    public void webdriver(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.quit();
    }
    @Test
    public void safariBrowser(){
        WebDriver driver= new SafariDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.quit();
    }
}
