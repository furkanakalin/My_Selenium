package Gun14;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

public class _01_RobotGiris extends BaseDriver {

    // interview sorusu
    // windows pencereleri nasıl kontrol edersin
    // Robot işlem ile
    @Test
    public void Test() throws AWTException {

        driver.get("https://www.selenium.dev/");
        MyFunc.Bekle(2);

        Robot robot=new Robot();
        driver.switchTo().window(driver.getWindowHandle());

        //Yeni pencere açma işlemi, yani ctrl+T

        robot.keyPress(KeyEvent.VK_META);//ctrl tuşuna bas...META=CTRL
        robot.keyPress(KeyEvent.VK_T);//aynı anda T tuşuna bas
        robot.keyRelease(KeyEvent.VK_T);//T tuşunu bırak
        robot.keyRelease(KeyEvent.VK_META);//ctrl tuşunu bırak
        MyFunc.Bekle(2);

        Set<String>idler=driver.getWindowHandles();
        Iterator gosterge= idler.iterator();
        String birincipencereID=gosterge.next().toString();
        String ikincipencereID=gosterge.next().toString();

        driver.switchTo().window(ikincipencereID);//yeni açılan pencereye geçip orada kalıyor.
        System.out.println(driver.getTitle());

        driver.get("https://www.hepsiburada.com/");//yeni açılan pencereye URL yi giriyor.

        BekleKapat();

    }
}
