package Page;

import org.openqa.selenium.By;

import static Utilities.selenium.DriverFactory.driver;

public class Logout {

    public void LogutUser(){
        driver.findElement(By.id("menu")).click();
        driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[7]/a")).click();
    }
}
