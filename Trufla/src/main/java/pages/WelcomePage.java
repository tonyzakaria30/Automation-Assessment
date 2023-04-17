package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage {

    //web driver
    private WebDriver driver;


    //constructor
    public WelcomePage(WebDriver driver){
        this.driver=driver;
    }

    //locators
    private By booksButton = By.xpath("//ul[@class='top-menu notmobile']/li[5]");



    //methods
    public void openBooksPage() {
        driver.findElement(booksButton).click();
    }
}

