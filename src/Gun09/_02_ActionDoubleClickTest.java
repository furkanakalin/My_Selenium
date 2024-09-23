package Gun09;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _02_ActionDoubleClickTest extends BaseDriver {

    @Test
    public void Test(){

        driver.get("https://demoqa.com/buttons");

        WebElement btnClick= driver.findElement(By.id("doubleClickBtn"));

        Actions actions=new Actions(driver);

        actions.moveToElement(btnClick).doubleClick().build().perform();

        BekleKapat();
    }
}
