package Gun05;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_Navigating extends BaseDriver {
    public static void main(String[] args) {

        driver.navigate().to("https://testpages.eviltester.com/styled/index.html");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        MyFunc.Bekle(2);

        WebElement element= driver.findElement(By.id("alerttest"));
        element.click();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        MyFunc.Bekle(2);

        driver.navigate().back(); //önceki sayfaya dön. geri ok tuşuna basılmış gibi.
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        MyFunc.Bekle(2);

        driver.navigate().forward();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        BekleKapat();

    }
}
