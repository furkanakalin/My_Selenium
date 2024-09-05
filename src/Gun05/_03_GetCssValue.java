package Gun05;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_GetCssValue {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://snapdeal.com/");

        WebElement element= driver.findElement(By.id("inputValEnter"));

        System.out.println(element.getAttribute("class"));
        System.out.println(element.getCssValue("Color"));
        System.out.println(element.getCssValue("background"));
        System.out.println(element.getCssValue("font-family"));

        MyFunc.Bekle(3);
        driver.quit();
    }
}
