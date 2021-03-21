package sceondTest;

import controller.ScriptBase;
import org.junit.Test;
import org.omg.CosNaming.BindingIterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SecondClass extends ScriptBase {
    @Test
    public void openBrowser() throws InterruptedException {
        init();
        driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Jabin@gmail.com");
        driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("1234");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='email']")).clear();
        driver.findElement(By.xpath("//*[@id='passwd']")).clear();
        WebElement element=driver.findElement(By.xpath("//*[@id='contact-link']/a"));
        element.isDisplayed();
        System.out.println(element.getText());
    }
}
