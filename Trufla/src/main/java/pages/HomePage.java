package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    //web driver
    private WebDriver driver;


    //constructor
    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    //locators
    private By registerButton = By.xpath("//a[@class='ico-register']");



    //methods
    public void clickRegisterButton() {
        driver.findElement(registerButton).click();
    }
}
