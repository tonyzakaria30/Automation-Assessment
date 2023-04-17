package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {

    //Web driver
    private WebDriver driver;

    //constructor
    public CheckOutPage (WebDriver driver){
        this.driver=driver;
    }

    //locators
    private By termCheckBox = By.xpath("//input[@id='termsofservice']");
    private By checkOutButton = By.xpath("//button[@id='checkout']");

    //method
    public void checkout(){
        driver.findElement(termCheckBox).click();
        driver.findElement(checkOutButton).click();
    }
}
