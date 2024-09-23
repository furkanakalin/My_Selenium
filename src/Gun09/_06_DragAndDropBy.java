package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _06_DragAndDropBy extends BaseDriver {

    @Test
    public void Test(){

        driver.get("https://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");
        driver.manage().window().maximize();

        WebElement cubuk= driver.findElement(By.id("slider-range"));
        System.out.println(cubuk.getSize().width);

        WebElement element1= driver.findElement(By.xpath("//*[@id='slider-range']/span[1]"));
        WebElement element2= driver.findElement(By.xpath("//*[@id='slider-range']/span[2]"));

        Actions actions=new Actions(driver);

        actions.dragAndDropBy(element1,100,0).build().perform();
        MyFunc.Bekle(2);

        actions.dragAndDropBy(element2,101,0).build().perform();


        BekleKapat();
    }
}
