package base;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ScriptBase {
    public WebDriver driver;
    String browser= "chrome";

    @BeforeTest

    public void init(){

        if(browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }else if(browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();

        }driver.get("http://automationpractice.com/index.php");

    }
    @AfterTest
    public void quit(){
        driver.quit();


    }


    }

    // System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
    // driver = new ChromeDriver();
    //driver.get("http://automationpractice.com/index.php");
    //   driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
    //  driver.quit();
   // @Test
   // public void init2(){
      //  System.setProperty("webdriver.gecko.driver","./drivers/geckodriver");
      //  WebDriver driver= new FirefoxDriver();
      //  driver.get("http://automationpractice.com/index.php");
      //  driver.quit();


    //}
   // @Test
   //public void webdriver(){
      //  WebDriverManager.chromedriver().setup();
       // WebDriver driver= new ChromeDriver();
       // driver.get("http://automationpractice.com/index.php");
      //  driver.quit();*\
   // }
   // @Test
    //public void safariBrowser(){
      //  WebDriver driver= new SafariDriver();
       // driver.get("http://automationpractice.com/index.php");
       // driver.quit();

//}
