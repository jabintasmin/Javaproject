package controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OverviewPageController {

    public OverviewPageController(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void overviewPageInfo(WebDriver driver, String info ){
        driver.findElement(By.xpath("//a[contains(text(),'"+info+"')]")).isDisplayed();
    }

}
