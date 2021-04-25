package controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInController {
    @FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")
    WebElement signInButton;
    @FindBy(id = "email")
    WebElement inputEmail;
    @FindBy (id = "passwd")
    WebElement inputPass;



public  LogInController(WebDriver driver){
    PageFactory.initElements(driver,this);

    }
    public void setSignInButton(){

        signInButton.isDisplayed();
    }
    public void validLogInInput(){
        signInButton.click();
        inputEmail.sendKeys("jabin@gmail.com");
        inputPass.sendKeys("1234");
    }
}
