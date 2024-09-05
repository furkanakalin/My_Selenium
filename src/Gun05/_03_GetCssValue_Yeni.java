package Gun05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_GetCssValue_Yeni extends BaseDriver {
    public static void main(String[] args) {

        //BaseDriver clasından extend ettik ve BaseDriver clasında ki static olan kısım ilk olarak burada çalıştı.
        //Yani BaslangicIslemleri(): direkt static bölüm çalıştı.

        driver.get("https://snapdeal.com/");

        WebElement element= driver.findElement(By.id("inputValEnter"));

        System.out.println(element.getAttribute("class"));
        System.out.println(element.getCssValue("Color"));
        System.out.println(element.getCssValue("background"));
        System.out.println(element.getCssValue("font-family"));

        BekleKapat();
    }

}
