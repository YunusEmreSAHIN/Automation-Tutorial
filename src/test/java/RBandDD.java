import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class RBandDD {
    WebDriver driver = new ChromeDriver();
    private By cssReklam1 = By.id("intclose");
    private By ddlAltinCinsi = By.xpath("//select[@id='ddl_AltinCinsi1']");
    private By rButton = By.cssSelector("[class='radioBtnGroup'] [for='rbl_AltinSatis']");

    void bekle(long sure, By elem) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sure));
        wait.until(ExpectedConditions.presenceOfElementLocated(elem));
    }

    void baslangic() {
        driver.get("https://bigpara.hurriyet.com.tr/altin/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        bekle(15, cssReklam1);
        driver.findElement(cssReklam1).click();
    }

    @Test
    void ddList() {
        baslangic();
        Select altinCinsi = new Select(driver.findElement(ddlAltinCinsi));
        //altinCinsi.selectByIndex(3);
        altinCinsi.selectByVisibleText("TL");
        List<WebElement> ddlList = altinCinsi.getOptions();
        for (WebElement lst : ddlList) {
            System.out.println(lst.getText());
        }
    }

    @Test
    void radioButton() {
        baslangic();
        //Assert.assertTrue(driver.findElement(By.xpath("//input[@id='rbl_AltinSatis']")).isSelected());
        driver.findElement(rButton).click();
    }
}
