package Gun11;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _06_Soru extends BaseDriver {

    /*
Senaryo
1-  https://www.demoblaze.com/index.html  siteyi açınız.
2- Samsung galaxy s6  linkine tıklayınız.
3- Sepete ekleyiniz.
4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününz
 */
    @Test
    public void Test(){

        driver.get("https://www.demoblaze.com/index.html");

        WebElement btn= driver.findElement(By.xpath("//*[text()='Samsung galaxy s6']"));
        btn.click();

        //WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20)); BaseDriver'a ekledik.
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@onclick='addToCart(1)']")));//element tıklanabilir olana kadar bekle.

        WebElement addcard= driver.findElement(By.xpath("//*[@onclick='addToCart(1)']"));
        addcard.click();

        wait.until(ExpectedConditions.alertIsPresent());//alert görünene kadar bekle.

        driver.switchTo().alert().accept();

        WebElement productstore= driver.findElement(By.id("nava"));
        productstore.click();

        Assert.assertTrue("Ana Sayfaya dönülemedi",
                driver.getCurrentUrl().equalsIgnoreCase("https://www.demoblaze.com/index.html"));

        BekleKapat();
    }
}
