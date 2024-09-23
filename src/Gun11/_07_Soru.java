package Gun11;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _07_Soru extends BaseDriver {
    /*
        Senaryo:
        https://google.com/ da selenium kelimesini aratınız.
        ilk çıkan sonuca tıklatıp,(selenium)
        çıkan URL yi ekrana yazdırınız.
        Beklenen url https://www.selenium.dev/  olduğunu doğrulayınız
     */
    @Test
    public void Test(){

        driver.get("https://google.com/");

        WebElement search= driver.findElement(By.xpath("//*[@class='gLFyf']"));
        search.sendKeys("selenium", Keys.ENTER);

        //wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK")));
        //WebElement ara= driver.findElement(By.name("btnK"));
        //ara.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='BYM4Nd']//*[@class='LC20lb MBeuO DKV0Md']")));
        WebElement selenium= driver.findElement(By.xpath("//*[@class='BYM4Nd']//*[@class='LC20lb MBeuO DKV0Md']"));
        selenium.click();

        Assert.assertTrue("Sayfaya gidilemedi", driver.getCurrentUrl().equalsIgnoreCase("https://www.selenium.dev/"));

        BekleKapat();

    }
}
