package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class BooksPage {


    //web driver
    private WebDriver driver;


    //constructor
    public BooksPage(WebDriver driver) {
        this.driver = driver;
    }

    //locators
    private By sortButton = By.xpath("(//select[@id='products-orderby'])//option[4]");
    private By secondBook = By.xpath("(//button[@class='button-2 product-box-add-to-cart-button'])[2]");
    private By goToCart = By.xpath("//a[@class='ico-cart']");
    private By sortedBookPrice = By.xpath("(//span[@class='price actual-price'])[1]");

    //methods
    //@Description("sorting books")
    public void sortingBooks() {
        driver.findElement(sortButton).click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(5000));
        wait.until(ExpectedConditions.textToBe(sortedBookPrice,"$24.00"));
    }
    public void selectSecondBook ()  {

        driver.findElement(secondBook).click();
    }
    public void checkTheCart (){
        driver.findElement(goToCart).click();
    }
}
