package baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;



public class TestCase {
    private WebDriver driver;
    private HomePage homePage;
    private RegisterPage registerPage;
    private LoginPage loginPage;
    private WelcomePage welcomePage;
    private BooksPage booksPage;
    private CheckOutPage checkOutPage;



        @Test
        public void newUserBuysBookSuccessfully() {
            homePage.clickRegisterButton();
            registerPage.registrationSuccessfully();

            // Assert that the email is registered successfully
            Assert.assertEquals(driver.findElement(By.xpath("//div[@class='result']")).getText(),"Your registration completed");

            registerPage.goToLoginPage();
            loginPage.loginUserSuccessfully();
            welcomePage.openBooksPage();
            booksPage.sortingBooks();

            // Assert that the books are sorted
            Assert.assertEquals(driver.findElement( By.xpath("(//span[@class='price actual-price'])[1]")).getText(), "$24.00");

            booksPage.selectSecondBook();
            booksPage.checkTheCart();

            // Assert that the selected book is in the cart
            Assert.assertEquals(driver.findElement(By.xpath("//a[@class='product-name']")).getText(), "Fahrenheit 451 by Ray Bradbury");

            checkOutPage.checkout();



        }
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        loginPage = new LoginPage(driver);
        welcomePage = new WelcomePage(driver);
        booksPage = new BooksPage(driver);
        checkOutPage = new CheckOutPage(driver);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
