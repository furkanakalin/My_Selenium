package Gun06;

import Utility.BaseDriver;

import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_CssSelector extends BaseDriver {
    // 1- https://formsmarts.com/form/yu?mode=h5 sitesini açın
    // 2- Business i çekleyin.
    // 3- discover XYZ ye tıklatın ve online Advertising i seçin
    // 4- Every day i seçin
    // 5- Good u seçin
    // 6- using XYZ yi tıklatın ve 3.seçeneği seçin
    // css selector
    // her bir tıklatma vs işlemin arasına MyFunc.Bekle(2);

    @Test
    public void Test2(){

        driver.get("https://formsmarts.com/form/yu?mode=h5");

        WebElement business= driver.findElement(By.cssSelector("input[name='u_187_4586'][id='u_187_4586_0']"));
        business.click();
        MyFunc.Bekle(2);

        WebElement discoverXYZ= driver.findElement(By.cssSelector("[name='u_187_4588']"));
        discoverXYZ.click();
        MyFunc.Bekle(2);

        WebElement onlinead= driver.findElement(By.cssSelector("[value='Online Advertising']"));
        onlinead.click();
        MyFunc.Bekle(2);

        WebElement everyday = driver.findElement(By.cssSelector("[id='u_187_89585_0']"));
        everyday.click();
        MyFunc.Bekle(2);

        WebElement good = driver.findElement(By.cssSelector("[id='u_187_4589_0']"));
        good.click();
        MyFunc.Bekle(2);

        WebElement usingXYZ = driver.findElement(By.cssSelector("[id='u_187_4597']"));
        usingXYZ.click();
        MyFunc.Bekle(2);

        WebElement ucuncu = driver.findElement(By.cssSelector("[value$='using XYZ for a month or more']"));
        ucuncu.click();
        MyFunc.Bekle(2);


        BekleKapat();


    }
}
