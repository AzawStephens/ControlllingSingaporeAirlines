import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automation {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kenji\\Documents\\PROGRAMMING\\UdemyCourse\\chromedriver_win32\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        String url = "https://www.singaporeair.com/en_UK/us/home#/book/bookflight";

       destinationTest(chromeDriver, url);

    }

    public static void destinationTest(WebDriver driver, String url) throws InterruptedException {
        driver.get(url);
        driver.findElement(By.xpath("//div[@class='btn-1 cookie-continue']")).click();
        driver.manage().window().maximize();
        Actions scroller = new Actions(driver);
        scroller.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id = 'flightOrigin1']")).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id = 'flightOrigin1']")).sendKeys("MIA");

        Thread.sleep(1000);
        driver.findElement(By.id("bookFlightDestination")).sendKeys("EWR");

        passengersTest(driver);
    }
    public static void dates(WebDriver driver)
    {

    }

    public static void passengersTest(WebDriver driver) throws InterruptedException {


        driver.findElement(By.id("flightPassengers1")).click();

        for(int i = 0; i<5;++i)
        {
            driver.findElement(By.xpath("//button[@class = 'btn--image_icon input__number--ticker-plus']")).click();
            Thread.sleep(1000);
        }
        for(int i = 0; i<2;++i)
        {
            driver.findElement(By.xpath("//div[@tabindex = '3']")).click();
            Thread.sleep(1000);
        }

            driver.findElement(By.xpath("//div[@tabindex = '4']")).click();
            Thread.sleep(1000);





    }
}
