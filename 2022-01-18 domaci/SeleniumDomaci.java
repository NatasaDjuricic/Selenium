package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumDomaci {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.google.com/");
        WebElement trazi = driver.findElement(By.name("q"));
        trazi.sendKeys("youtube");

        WebElement trazi1 = driver.findElement(By.name("btnK"));
        Thread.sleep(2000);
        trazi1.click();


        WebElement linkYT = driver.findElement(By.cssSelector(".LC20lb.MBeuO.DKV0Md"));
        Thread.sleep(2000);

        linkYT.click();

        WebElement searchYT = driver.findElement(By.name("search_query"));
        searchYT.click();
        searchYT.sendKeys("rick astley never gonna give you up");

        WebElement ButtonYT = driver.findElement(By.id("search-icon-legacy"));
        ButtonYT.click();

        Thread.sleep(2000);

        WebElement song = driver.findElement(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string"));
        song.click();


    }
}
