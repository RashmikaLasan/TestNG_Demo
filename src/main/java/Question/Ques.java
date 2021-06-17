package Question;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ques {

    public WebDriver driver;

    @Test(priority = 0)
    public void seleniumDriver() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "E:\\Software\\Selenium\\ChromeDriver91\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://letskodeit.teachable.com");
        driver.manage().window().maximize();
        Thread.sleep(10000);

    }

    @Test(priority = 1)
    public void clickLogin() throws InterruptedException {

        System.out.println("aaasas");
        driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
        Thread.sleep(5000);

    }

    @Test(priority = 2)
    public void enterLoginDetails() throws InterruptedException {

        driver.findElement(By.id("user_email")).sendKeys("sdsdsd@gmal.com");
        driver.findElement(By.id("user_password")).sendKeys("sdsdsdsd");
        Thread.sleep(5500);


    }

}
