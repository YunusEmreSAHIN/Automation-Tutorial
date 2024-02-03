import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class İslemler {
    WebDriver driver = new EdgeDriver();
    private By cssReklam1 = By.id("percent");
    private By My_nav = By.className("percent");
    private By btnheadremenu = By.tagName("a");
    private By btnElement = By.id("sana-ozel-btn");
    private By btnsearch = By.id("myGlobalSearchBtn");
    private By textsrc = By.id("myGlobalSearchInput");



    @Test
    void tutorial() throws InterruptedException {
        driver.get("https://www.mynet.com/");
        driver.manage().window().maximize();
        //Thread.sleep(2000);
        //WebElement reklam1 = driver.findElement(cssReklam1);
        //reklam1.click();
        //Thread.sleep(2000);
        //WebElement reklam2 = driver.findElement(cssReklam1);
        //reklam2.click();

        WebElement element = driver.findElement(My_nav);
        List<WebElement> headrMenuBtn = element.findElements(btnheadremenu);
        for (WebElement lst : headrMenuBtn) {
            //tek sıra halinde listelemek için
            System.out.print(lst.getText() + ", ");
            if (lst.getText().equals("SPOR")) {
                lst.click();
            }
        }
        System.out.println(" ");
        //CSS Value
        WebElement cssElement = driver.findElement(btnElement);
        System.out.println(cssElement.getCssValue("width"));
//Send Keys
        WebElement clcsearch = driver.findElement(btnsearch);
        clcsearch.click();
        WebElement srctext = driver.findElement(textsrc);
        srctext.sendKeys("deneme");
        //WebElement clcsearch = driver.findElement(By.id("myGlobalSearchBtn"));
        //clcsearch.click();
        //Attribute
        //WebElement srctext = driver.findElement(By.id("myGlobalSearchInput"));
        //Assert.assertEquals(srctext.getAttribute("placeholder"),"Aradığınız kelimeyi yazın...");
        //Tagname
        System.out.println(srctext.getTagName());
                //driver.quit();
    }

}
