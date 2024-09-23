package Gun09;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionHoverTest extends BaseDriver {

    @Test
    public void Test(){

        driver.get("https://www.hepsiburada.com/");

        WebElement btnClick= driver.findElement(By.xpath("//*[text()='Moda']"));

        Actions actions=new Actions(driver);

        actions.moveToElement(btnClick).build().perform();

        BekleKapat();


    }
}
