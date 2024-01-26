import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class BaseTest {
    WebDriver driver = new EdgeDriver();

    @Test
        // İlk deneme
    /*
    void titleControl() {
        driver.get("https://www.google.com.tr/");
        System.out.println(driver.getTitle());
       // driver.quit();
    }
*/
        // İkinci Deneme

    /* void titleControl() {
        driver.get("https://www.haberturk.com/");
        WebElement elem = driver.findElement(By.linkText("Spor"));
        System.out.println(elem.getText());
        elem.click();
        // driver.quit();

    } */
        // Üçüncü Deneme
    void getList() {
        driver.get("https://www.mynet.com/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.className("my-nav"));
        List<WebElement> headrMenuBtn = element.findElements(By.tagName("a"));
        for (WebElement lst : headrMenuBtn) {
            if (lst.getText().equals("SPOR")) {
                lst.click();
            }
        }
        // driver.quit();
    }
}

