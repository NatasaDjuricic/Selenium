//Ne umem da uradim domaci...do 17h mi je malo vremena da istrazim sta se desava

//Zadatak 3 - Ulogovati se na sajt https://demoqa.com/ preko kolacica,
// izlogovati se
// i asertovati da je korisnik izlogovan

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DomaciSelenium {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wdwait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();

        driver.navigate().to("https://demoqa.com/profile");

        Cookie kolacic1 = new Cookie("IDE","AHWqTUnjJhJuGQKQmsv54p4ufowExCZCeQHDWxBt6_ANARAamsWHFmitXfY6vnDc2JA");
      //  Cookie kolacic2 = new Cookie("_ga_MVRXK93D28", "GS1.1.1642344529.1.1.1642346982.0");
        Cookie kolacic3 = new Cookie("_ga_MVRXK93D28", "GS1.1.1642344529.1.1.1642345260.0");
        Cookie kolacic4 = new Cookie("userName", "Nata");
        Cookie kolacic5 = new Cookie("userID", "9ebf2f55-7178-4f8e-82cc-8be4524ca341");
        Cookie kolacic6 = new Cookie("token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6Ik5hdGEiLCJwYXNzd29yZCI6IlF3ZXJ0eTEyMyMiLCJpYXQiOjE2NDIzNDUyNTl9.OE4vtxDTlXZXm1HWgLT0GUDlodQ2YK-sn-r7NKulIG0");
        Cookie kolacic7 = new Cookie("__gads", "ID=08c18d54c797af1f:T=1642343351:S=ALNI_MYbxyFRR85r9Pw_-VhguexKTn7UOQ");



       driver.manage().addCookie(kolacic1);
       Thread.sleep(2000);
    //    driver.manage().addCookie(kolacic2);
     //   Thread.sleep(2000);
        driver.manage().addCookie(kolacic3);
        Thread.sleep(2000);
        driver.manage().addCookie(kolacic4);
        Thread.sleep(2000);
        driver.manage().addCookie(kolacic5);
        Thread.sleep(2000);
        driver.manage().addCookie(kolacic6);


       // driver.navigate().refresh();



    }
}
