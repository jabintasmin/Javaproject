package controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartController {
    @FindBy(xpath = "//*[@id='header']/div[3]/div/div/div[3]/div/a/span[5]")
    WebElement cartButton;
    public CartController(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void cartButtonDisplayed(){
        cartButton.isDisplayed();
        

    }
}
