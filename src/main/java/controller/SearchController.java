package controller;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchController {
    @FindBy(xpath = "//*[@id='search_query_top']")
    WebElement searchInputBox;
    @FindBy(name = "submit_search")
    WebElement submitSearch;
    @FindBy(xpath = "//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img")
    WebElement floralDress;
    @FindBy(xpath = "//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[1]/span")
    WebElement addToCartButton;
    @FindBy(xpath= "//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")
    WebElement checkOutButton;
    ;

    public SearchController(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void searchDisplay(WebDriver driver, String searchValue) {
        driver.findElement(By.xpath("//h1/span[contains(text(),'" + searchValue + "')]")).isDisplayed();

    }

    public void searchProduct(WebDriver driver, String searchProductName) {
        searchInputBox.clear();
        searchInputBox.sendKeys(searchProductName);
        submitSearch.click();
        searchDisplay(driver, searchProductName);
        System.out.println(searchProductName);

    }

    public void mouseHover1(WebDriver driver, WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();

    }
    public void mouseHoverDress(WebDriver driver) throws InterruptedException {
        mouseHover1(driver, floralDress);
        addToCartButton.click();
        Thread.sleep(2000);

    }

    public void clickJavaScriptExecutor(WebDriver driver) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()",checkOutButton);


    }


}

