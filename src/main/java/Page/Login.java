package Page;

import Utilities.selenium.DriverFactory;
import Utilities.testData.Constant;
import org.openqa.selenium.By;
import static Utilities.selenium.DriverFactory.driver;

public class Login {

    public void LoginValidUser(){
        driver = DriverFactory.getDriver();
        driver.get("https://practicesoftwaretesting.com/auth/login");
        driver.findElement(By.id("email")).sendKeys("amiramahdy339@gmail.com");
        driver.findElement(By.id("password")).sendKeys("pAassword1@");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
    }

    public void LoginInvalidUser(){
        driver.get("https://practicesoftwaretesting.com/auth/login");
        driver.findElement(By.id("email")).sendKeys(Constant.InValid_Email);
        driver.findElement(By.id("password")).sendKeys("Momen1996!");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
    }
}
