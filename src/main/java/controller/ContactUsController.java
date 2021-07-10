package controller;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactUsController {
    @FindBy(xpath = "//*[@id='contact-link']/a")
    WebElement contactUsButton;
    @FindBy(id = "email")
    WebElement inputEmail;
    @FindBy(xpath = "//*[@id='id_order']")
    WebElement inputReference;
    @FindBy(xpath = "//*[@id='submitMessage']/span")
    WebElement sendButton;
    @FindBy(id = "massage")
    WebElement message;
    public ContactUsController(WebDriver driver){

        PageFactory.initElements(driver,this);
    }
    public void displayContactUsButton(){
        contactUsButton.click();
    }
    public void dropDownButton(WebDriver driver){
        Select dropDown = new Select(driver.findElement((By.xpath("//*[@id='id_contact']"))));
        String option= "2";
        dropDown.selectByValue(option);
    }
    public void contactUsInput(){
        inputEmail.sendKeys("jabin@gmail.com");
        inputReference.sendKeys("1234789");

    }
    public void attachFile(WebDriver driver) {
        WebElement choseFile= driver.findElement(By.id("fileUpload"));
        choseFile.sendKeys("//Users//jabinuttora//Desktop//AutomationTest");
    }
    public void inputMessage(){

        message.sendKeys("Welcome to Automation World");
    }
    public void sendKeyButton(){

        sendButton.click();
    }
}
