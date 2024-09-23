package Gun11;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_ImplicitlyWait extends BaseDriver {

    @Test
    public void Test(){

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement btn= driver.findElement(By.xpath("//*[@onclick='timedText()']"));
        btn.click();

        WebElement msj=driver.findElement(By.xpath("//*[text()='WebDriver']"));
        System.out.println(msj.getText());

        BekleKapat();
    }
}
