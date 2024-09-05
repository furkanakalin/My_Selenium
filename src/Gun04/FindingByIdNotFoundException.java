package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingByIdNotFoundException {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");


        try {
            WebElement isimkutusu=driver.findElement(By.id("Hatalı Element"));
        }catch (Exception e){
            System.out.println("Bu locator da bir element bulunamadı "+e.getMessage());
        }
        MyFunc.Bekle(3);
        driver.quit();
    }
}
