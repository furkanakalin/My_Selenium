package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingByName {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");
        driver.manage().window().maximize(); // Ekranı max yapıyor
        MyFunc.Bekle(2);

        WebElement commentbutton =driver.findElement(By.id("label_input_3_0"));
        commentbutton.click();
        MyFunc.Bekle(2);

        WebElement isim = driver.findElement(By.name("q8_name[first]"));
        isim.sendKeys("Furkan");
        MyFunc.Bekle(2);

        WebElement soyisim = driver.findElement(By.name("q8_name[last]"));
        soyisim.sendKeys("Akalın");
        soyisim.clear();//kutucuğu temizler
        soyisim.sendKeys("Robin");
        MyFunc.Bekle(2);

        WebElement submitbutton = driver.findElement(By.id("input_2"));
        submitbutton.click();

        MyFunc.Bekle(3);
        driver.quit();
    }
}
