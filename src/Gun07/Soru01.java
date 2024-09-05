package Gun07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru01 extends BaseDriver {
//        Senaryo
//        1- https://www.saucedemo.com/
//        2- login işlemini yapınız.
//        3- Sauce Labs Backpack  a tıklatın ve sepete ekletin.
//        4- Sonra geri dönün (Back to products e tıklatın)
//        5- Sauce Labs Bolt T-Shirt  a tıklatın ve sepete ekleyin.
//        6- sepete tıklatın
//        7- CheckOut a tıklatın
//        8- kullanıcı bilgilerini doldurup Continue ya tıklatın
//        9- Burada her bir eşyanın ücretlerinin toplamının aşağıdaki
//        Item total e eşit olup olmadığını Assert ile test ediniz.
//
//        Bu soruda tamamen XPATH kullanılacaktır.
    //    Assert.assertTrue(urunFiyatToplamlam == itemTotal)


    @Test
    public void Test(){

        driver.get("https://www.saucedemo.com");

        WebElement username = driver.findElement(By.xpath("//*[@placeholder='Username']"));
        username.sendKeys("standard_user");
        MyFunc.Bekle(2);

        WebElement password = driver.findElement(By.xpath("//*[@placeholder='Password']"));
        password.sendKeys("secret_sauce");
        MyFunc.Bekle(2);

        WebElement login= driver.findElement(By.xpath("//*[@id='login-button']"));
        login.click();
        MyFunc.Bekle(2);

        WebElement item1 = driver.findElement(By.xpath("//*[@id='item_4_title_link']//div"));
        item1.click();
        MyFunc.Bekle(2);

        WebElement addcard1 = driver.findElement(By.xpath("//*[@class='inventory_details_price']//following::button"));
        addcard1.click();
        MyFunc.Bekle(2);
        driver.navigate().back();

        WebElement item2 = driver.findElement(By.xpath("//*[text()='Sauce Labs Bolt T-Shirt']"));
        item2.click();
        MyFunc.Bekle(2);

        WebElement addcard2 = driver.findElement(By.xpath("//*[@class='inventory_details_price']//following::button"));
        addcard2.click();
        MyFunc.Bekle(2);

        WebElement sepetim = driver.findElement(By.xpath("//*[@id='shopping_cart_container']//span"));
        sepetim.click();
        MyFunc.Bekle(2);

        WebElement checkout = driver.findElement(By.xpath("//*[text()='Checkout']"));
        checkout.click();
        MyFunc.Bekle(2);

        WebElement firstname = driver.findElement(By.xpath("//*[@id='first-name']"));
        firstname.sendKeys("Furkan");
        MyFunc.Bekle(2);

        WebElement lastname = driver.findElement(By.xpath("//*[@id='last-name']"));
        lastname.sendKeys("Akalın");
        MyFunc.Bekle(2);

        WebElement postalcode = driver.findElement(By.xpath("//*[@id='postal-code']"));
        postalcode.sendKeys("34197");
        MyFunc.Bekle(2);

        WebElement continuee = driver.findElement(By.xpath("//*[@id='continue']"));
        continuee.click();
        MyFunc.Bekle(2);





    }
}
