package Gun11;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _05_Ornek extends BaseDriver {

    @Test
    public void Test(){

        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");

        WebElement btn1= driver.findElement(By.id("btn1"));
        btn1.click();

        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt1")));

        WebElement txt1= driver.findElement(By.id("txt1"));
        txt1.sendKeys("Furkan");
        MyFunc.Bekle(2);

        WebElement btn2 = driver.findElement(By.id("btn2"));
        btn2.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt2")));

        WebElement txt2= driver.findElement(By.id("txt2"));
        txt2.sendKeys("Akalın");

        BekleKapat();
    }
}
