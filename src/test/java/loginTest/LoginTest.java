package loginTest;

import Page.Login;
import Page.Logout;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.testng.Tag;
import io.qameta.allure.testng.Tags;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import java.time.Duration;

import static Utilities.selenium.DriverFactory.driver;

public class LoginTest {

    final Login login = new Login();
    final Logout logout = new Logout();

    @org.testng.annotations.Test(priority = 1)
    @Description("Login with valid user")
    @Link("https://talent500.com/blog/how-to-install-and-use-the-scoop-windows-package-manager/")
    @Tag("End to End")
    @Severity(SeverityLevel.CRITICAL)
    public void LoginWithValidCredentials(){
        login.LoginValidUser();
    }

    @org.testng.annotations.Test(priority = 2)
    @Description("Login with valid user")
    @Severity(SeverityLevel.CRITICAL)
    @Link("https://talent500.com/blog/how-to-install-and-use-the-scoop-windows-package-manager/")
    @Tag("End to End")
    public void LoginWithInvalidCredentials(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu")));
        logout.LogutUser();
        login.LoginInvalidUser();
        WebElement errorMessageElement2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.help-block")));
        String errorMessage = errorMessageElement2.getText();
        Assert.assertEquals("Invalid email or password", errorMessage);
    }

    @AfterTest
    public void Close_Driver(){
        driver.close();
    }
}
