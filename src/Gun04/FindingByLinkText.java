package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingByLinkText {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("http://www.hepsiburada.com");
        MyFunc.Bekle(2);

        WebElement element= driver.findElement(By.linkText("Siparişlerim"));
        System.out.println(element.getText());

        WebElement element1= driver.findElement(By.partialLinkText("Süper Fiyat"));
        System.out.println(element1.getText());

        MyFunc.Bekle(3);
        driver.quit();

    }
}
