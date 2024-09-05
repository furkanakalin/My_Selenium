package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementGetText {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement labelfirstname=driver.findElement(By.id("sublabel_8_first"));
        System.out.println(labelfirstname.getText());//Web elementin ekranda çıkan yazısı

        WebElement labellastname=driver.findElement(By.id("sublabel_8_last"));
        System.out.println(labellastname.getText());//Web elementin ekranda çıkan yazısı

        MyFunc.Bekle(3);
        driver.quit();
    }
}
