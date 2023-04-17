package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class RegisterPage {

    //web driver
    private WebDriver driver;

    //constructor
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    //locators
    private By genderButton = By.xpath("//input[@id='gender-male']");
    private By firstName = By.xpath("//input[@id='FirstName']");
    private By lastName = By.xpath("//input[@id='LastName']");
    private By dateOfBirthDay = By.xpath("//select[@name='DateOfBirthDay']//option[@value='19']");
    private By dateOfBirthMonth = By.xpath("//select[@name='DateOfBirthMonth']//option[@value='8']");
    private By dateOfBirthYear = By.xpath("//select[@name='DateOfBirthYear']//option[@value='1995']");
    private By emailBox = By.xpath("//input[@id='Email']");
    private By passWord = By.xpath("//input[@id='Password']");
    private By confirmPassword = By.xpath("//input[@id='ConfirmPassword']");
    private By registerButton2 = By.xpath("//button[@id='register-button']");
    private By loginButton = By.xpath("//a[@class='ico-login']");

    //methods
    public void registrationSuccessfully () {
        driver.findElement(genderButton).click();
        driver.findElement(firstName).sendKeys("tony");
        driver.findElement(lastName).sendKeys("zakaria");
        driver.findElement(dateOfBirthDay).click();
        driver.findElement(dateOfBirthMonth).click();
        driver.findElement(dateOfBirthYear).click();
        driver.findElement(emailBox).sendKeys("tony.zakaria"+emailGenerator()+"@gmail.com");
        driver.findElement(passWord).sendKeys("123456");
        driver.findElement(confirmPassword).sendKeys("123456");
        driver.findElement(registerButton2).click();

    }
    public void goToLoginPage (){
        driver.findElement(loginButton).click();

    }

    public int emailGenerator (){
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(1000);
    }
}

