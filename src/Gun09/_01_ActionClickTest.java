package Gun09;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _01_ActionClickTest extends BaseDriver {

    @Test
    public void Test(){

        driver.get("https://demoqa.com/buttons");

        WebElement btnClick= driver.findElement(By.xpath("//*[text()='Click Me']"));

        Actions actions=new Actions(driver);

        actions.moveToElement(btnClick).click().build().perform();

        BekleKapat();
    }
}
