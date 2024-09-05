package Gun05;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_GetAttribute {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.hepsiburada.com");
        MyFunc.Bekle(2);

        WebElement element= driver.findElement(By.linkText("Siparişlerim"));
        System.out.println(element.getText());

        System.out.println(element.getAttribute("href"));
        System.out.println(element.getAttribute("title"));
        System.out.println(element.getAttribute("rel"));

        MyFunc.Bekle(3);
        driver.quit();
    }
}
