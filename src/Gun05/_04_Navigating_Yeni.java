package Gun05;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.junit.Test;

public class _04_Navigating_Yeni extends BaseDriver {

    @Test
    public void Test1() {

        driver.navigate().to("https://testpages.eviltester.com/styled/index.html");
        MyFunc.Bekle(2);

        WebElement element= driver.findElement(By.id("alerttest"));
        element.click();
        MyFunc.Bekle(2);

        driver.navigate().back(); //önceki sayfaya dön. geri ok tuşuna basılmış gibi.
        MyFunc.Bekle(2);

        driver.navigate().forward();

        Assert.assertTrue(driver.getCurrentUrl().equals("https://testpages.eviltester.com/styled/alerts/alert-test.html"));
        //hata yoksa uyarı verme. sadece hata varsa uyarı ver. Örneğin burda hata yok.

        Assert.assertTrue(driver.getCurrentUrl().equals("1https://testpages.eviltester.com/styled/alerts/alert-test.html"));
        //örneğin burda hata var çünkü linkin başına 1 koydum. burda hata verir.

        BekleKapat();
    }
}
