package Gun09;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _03_ActionRightClickTest extends BaseDriver {

    @Test
    public void Test(){

        driver.get("https://demoqa.com/buttons");

        WebElement btnClick= driver.findElement(By.id("rightClickBtn"));

        Actions actions=new Actions(driver);

        actions.moveToElement(btnClick).contextClick().build().perform();

        BekleKapat();
    }
}
