package Gun06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_CssSelector extends BaseDriver {

    //    Senaryo:
//    Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
//    Calculate'e tıklayınız.
//    İlk input'a herhangi bir sayı giriniz.
//    İkinci input'a herhangi bir sayı giriniz.
//    Calculate button'una tıklayınız.
//    Sonucu yazdırınız.

    @Test
    public void Test(){

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement calculator= driver.findElement(By.cssSelector("[id='calculatetest']"));
        calculator.click();
        MyFunc.Bekle(2);

        WebElement ilkbosluk= driver.findElement(By.cssSelector("[id='number1']"));
        ilkbosluk.sendKeys("4");
        MyFunc.Bekle(1);

        WebElement ikincibosluk = driver.findElement(By.cssSelector("[id='number2']"));
        ikincibosluk.sendKeys("7");
        MyFunc.Bekle(1);

        WebElement clickcalculate= driver.findElement(By.cssSelector("[id='calculate']"));
        clickcalculate.click();
        MyFunc.Bekle(1);

        WebElement answer= driver.findElement(By.cssSelector("[id='answer']"));
        answer.getText();

        BekleKapat();

    }
}
