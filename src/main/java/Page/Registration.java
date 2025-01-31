package Page;

import org.openqa.selenium.By;
import static Utilities.selenium.DriverFactory.driver;

public class Registration {

    public void Register(){
        driver.get("https://practicesoftwaretesting.com/auth/register");
        driver.findElement(By.id("first_name")).sendKeys("Mohamed");
        driver.findElement(By.id("last_name")).sendKeys("Ehab");
        driver.findElement(By.id("dob")).sendKeys("12/19/1980");
        driver.findElement(By.id("address")).sendKeys("Maadi");
        driver.findElement(By.id("postcode")).sendKeys("12588");
        driver.findElement(By.id("city")).sendKeys("Cairo");
        driver.findElement(By.id("state")).sendKeys("Cairo");
        driver.findElement(By.id("country")).sendKeys("Egypt");
        driver.findElement(By.id("phone")).sendKeys("0122828028");
        driver.findElement(By.id("email")).sendKeys("mariomedhatmario1@gmail.com");
        driver.findElement(By.id("password")).sendKeys("P@ssw0rd123555");
        driver.findElement(By.xpath("//button[normalize-space()='Register']")).click();
    }
}
