package Gun11;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _03_ExplicitlyWait extends BaseDriver {

    @Test
    public void Test(){

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement btn= driver.findElement(By.xpath("//*[@onclick='timedText()']"));
        btn.click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBe(By.id("demo"),"WebDriver"));
        //id'si "demo" olan webelementin görünen yazısı "WebDriver" olana kadar bekle.

        WebElement demoMsj= driver.findElement(By.id("demo"));
        System.out.println(demoMsj.getText());

        BekleKapat();
    }
}
