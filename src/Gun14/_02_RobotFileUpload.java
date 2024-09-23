package Gun14;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class _02_RobotFileUpload extends BaseDriver {

    @Test
    public void Test() throws AWTException {

        driver.get("https://demo.guru99.com/test/upload/");
        MyFunc.Bekle(2);

        Robot robot=new Robot();
        driver.switchTo().window(driver.getWindowHandle());

        for (int i = 0; i <=13 ; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);

        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        // stringi hafızaya kopyalama yöntemi
        StringSelection dosyaYolu= new StringSelection("C:\\Users\\furkanakalin\\Desktop\\Screenshots\\logo.png");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(dosyaYolu, null);

        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_META);




        BekleKapat();
    }
}
