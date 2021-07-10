package controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPageController {
    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/a")
    WebElement womenButton;
    @FindBy(xpath = "//*[@id='block_top_menu']")
    WebElement topsButton;
    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a")
    WebElement dressButton;
    @FindBy(xpath = "//*[@id='block_top_menu']")
    WebElement casualDresses;
    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[3]/a")
    WebElement tShirtButton;
    public OverviewPageController(WebDriver driver){

        PageFactory.initElements(driver,this);
    }
    public void overviewPageInfo(WebDriver driver, String info ){
        driver.findElement(By.xpath("//a[contains(text(),'"+info+"')]")).isDisplayed();

    }

    public void womenCatalog(WebDriver driver) throws InterruptedException {
        mouseHover(driver,womenButton);
        Thread.sleep(2000);
        topsButton.isDisplayed();
    }
    public void dressCatalog(WebDriver driver) throws InterruptedException {
        mouseHover(driver,dressButton);
        Thread.sleep(2000);
        casualDresses.isDisplayed();
    }
    public void tShirtCatalog(WebDriver driver){
        mouseHover(driver,tShirtButton);

    }
    public void mouseHover(WebDriver driver,WebElement element){
        Actions actions= new Actions(driver);
        actions.moveToElement(element).perform();

    }



}
