package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinition.Hooks;

public class P01_login {

    public WebElement enterUsername(){
        return Hooks.driver.findElement(By.id("usern"));
    }

    public WebElement enterPassword()
    {
        return Hooks.driver.findElement(By.id("pass"));
    }

    public WebElement accessCode()
    {
        return Hooks.driver.findElement(By.id("acc"));
    }

    public WebElement loginClickBtn()
    {
        return Hooks.driver.findElement(By.xpath("/html/body/div/app-root/app-login/div/div/div/div[2]/div[2]/form/button"));
    }
}
