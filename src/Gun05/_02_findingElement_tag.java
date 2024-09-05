package Gun05;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _02_findingElement_tag {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("http://www.amazon.com.tr");

        List<WebElement> elements=driver.findElements(By.tagName("a"));

        for (WebElement element:elements){
            System.out.println(element.getText());

            if (!element.getText().equals("") && element.getAttribute("href")!=null);
            System.out.println(element.getText());
        }


        MyFunc.Bekle(3);
        driver.quit();
    }
}
