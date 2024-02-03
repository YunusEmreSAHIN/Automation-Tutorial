import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class SwitchToWindow {
    WebDriver driver = new ChromeDriver();
    private By canliBorsa = By.xpath("//a[@id='canliborsa']");
    private By username = By.xpath("//input[@id='userid']");
    private By tahmin = By.linkText("Borsa");
    private By giris = By.linkText("Giriş Yap");

    void bekle(long sure, By elem) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sure));
        wait.until(ExpectedConditions.presenceOfElementLocated(elem));
    }

    void windowSwitch(int selectWindow) {
        driver.switchTo().window(driver.getWindowHandles().toArray()[selectWindow].toString());
    }

    @Test
    void SwitchWindow() {
        driver.get("https://www.foreks.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        //WebDriverWait waitBtnCanliBorsa = new WebDriverWait(driver, Duration.ofSeconds(15));
        //waitBtnCanliBorsa.until(ExpectedConditions.presenceOfElementLocated(canliBorsa));
        bekle(15, canliBorsa);
        driver.findElement(canliBorsa).click();
        windowSwitch(1);
        //driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        //WebDriverWait waitBtnGiris = new WebDriverWait(driver, Duration.ofSeconds(15));
        //waitBtnGiris.until(ExpectedConditions.presenceOfElementLocated(giris));
        driver.findElement(giris).click();
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        //wait.until(ExpectedConditions.presenceOfElementLocated(username));
        bekle(15, username);
        driver.findElement(username).sendKeys("deneme");
        System.out.println(driver.getTitle());
        windowSwitch(0);
        //driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
        driver.findElement(tahmin).click();
    }
}