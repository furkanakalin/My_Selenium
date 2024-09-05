package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindingByClass {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");
        MyFunc.Bekle(2);

        WebElement element= driver.findElement(By.className("form-sub-label"));
        System.out.println(element.getText());

        List<WebElement> elements=driver.findElements(By.className("form-sub-label"));
        for (WebElement e:elements)
            System.out.println(e.getText());

        System.out.println(elements.size());

        MyFunc.Bekle(3);
        driver.quit();
            
        }


    }
