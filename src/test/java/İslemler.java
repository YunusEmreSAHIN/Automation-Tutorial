import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class İslemler {
    WebDriver driver = new EdgeDriver();

    @Test
    void tutorial() throws InterruptedException {
        driver.get("https://www.mynet.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement reklam1 = driver.findElement(By.id("percent"));
        reklam1.click();
        Thread.sleep(2000);
        WebElement reklam2 = driver.findElement(By.id("percent"));
        reklam2.click();
        /*
        WebElement element = driver.findElement(By.className("my-nav"));
        List<WebElement> headrMenuBtn = element.findElements(By.tagName("a"));
        for (WebElement lst : headrMenuBtn) {
            //tek sıra halinde listelemek için
            System.out.print(lst.getText() + ", ");
            if (lst.getText().equals("SPOR")) {
                lst.click();
            }
        }
        System.out.println(" ");
        //CSS Value
        WebElement cssElement = driver.findElement(By.id("sana-ozel-btn"));
        System.out.println(cssElement.getCssValue("width"));
//Send Keys
        WebElement clcsearch = driver.findElement(By.id("myGlobalSearchBtn"));
        clcsearch.click();
        WebElement srctext = driver.findElement(By.id("myGlobalSearchInput"));
        srctext.sendKeys("deneme");
*/
        WebElement clcsearch = driver.findElement(By.id("myGlobalSearchBtn"));
        clcsearch.click();
        //Attribute
        WebElement srctext = driver.findElement(By.id("myGlobalSearchInput"));
        Assert.assertEquals(srctext.getAttribute("placeholder"),"Aradığınız kelimeyi yazın...");
        //Tagname
        System.out.println(srctext.getTagName());
        driver.quit();
    }

}
