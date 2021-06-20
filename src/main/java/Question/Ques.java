package Question;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Ques {

    public WebDriver driver;

    @Test(priority = 0)
    @Parameters({"browser"})
    public void seleniumDriver(String browser) throws InterruptedException {

        if (browser.equalsIgnoreCase("chrome")) {

            System.setProperty("webdriver.chrome.driver", "E:\\Software\\Selenium\\ChromeDriver91\\chromedriver.exe");
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {

            System.setProperty("webdriver.gecko.driver", "E:\\Software\\Selenium\\GeckoDriver291\\geckodriver.exe");
            driver = new FirefoxDriver();
        }

        driver.get("https://letskodeit.teachable.com");
        driver.manage().window().maximize();
        Thread.sleep(10000);
    }

    @Test(priority = 1)
    public void clickLogin() throws InterruptedException {

        System.out.println("Redirect to the Site");
        driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
        Thread.sleep(5000);

    }

    @Test(priority = 2)
    @Parameters({"userName", "Pword"})
    public void enterLoginDetails(String userName, String Pword) throws InterruptedException {

        driver.findElement(By.id("user_email")).sendKeys(userName);
        driver.findElement(By.id("user_password")).sendKeys(Pword);
        Thread.sleep(5500);


    }

    @Test(priority = 3)
    public void clickSubmit() throws InterruptedException {

        driver.findElement(By.xpath("//input[@name='commit']")).click();
        Thread.sleep(5000);
    }


    @Test(priority = 4)
    public void quitDriver() {

        driver.quit();
        System.out.println("Web Driver Quit");

    }



}
