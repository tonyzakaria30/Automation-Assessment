package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    //web driver
    private WebDriver driver;


    //constructor
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    //locators
    private By emailButton = By.xpath("//input[@id='Email']");
    private By passWordButton = By.xpath("//input[@id='Password']");
    private By loginEnter = By.xpath("//button[@class='button-1 login-button']");


    //methods
    public void loginUserSuccessfully() {
        driver.findElement(emailButton).sendKeys("tony.zakaria3@gmail.com");
        driver.findElement(passWordButton).sendKeys("123456");
        driver.findElement(loginEnter).click();
    }
}
