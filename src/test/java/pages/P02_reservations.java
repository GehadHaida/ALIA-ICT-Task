package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import stepDefinition.Hooks;

import java.time.Duration;

public class P02_reservations {

    public void laterPopup()
    {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(30));
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("div[role=\"dialog\"].k-widget.k-window.k-dialog")
        ));
        Hooks.driver.findElement(By.cssSelector("button.n-button.n-button--primary-border.ng-star-inserted")).click();
    }

    public WebElement reservationsBtn()
    {
        return Hooks.driver.findElement(By.cssSelector("a.n-sidebar__item[href=\"/reservations\"]"));
    }

    public WebElement addNewReservation()
    {
        return Hooks.driver.findElement(By.cssSelector("button.n-button.n-button--green"));
    }

    public void visitPurpose() throws InterruptedException {
        Thread.sleep(6000);
        WebElement dropdown = Hooks.driver.findElement(By.className("k-dropdown-wrap"));
        dropdown.click();
        dropdown.sendKeys("t");
        dropdown.sendKeys(Keys.ENTER);
    }

    public void reservationSource() throws InterruptedException {
        WebElement dropdown2 = Hooks.driver.findElement(By.className("combobox-icon-item"));
        dropdown2.click();
        Thread.sleep(2000);
//        dropdown2.sendKeys("b");
//        dropdown2.sendKeys(Keys.ENTER);
    }

    public WebElement selectUnitNow()
    {
        return Hooks.driver.findElement(By.className("primary-link"));
    }

    public WebElement selectRoom() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(30));
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("div[role=\"dialog\"].k-widget.k-window.k-dialog")
        ));
        Thread.sleep(2000);
        return Hooks.driver.findElement(By.xpath("//*[@id=\"k-panelbar-0-item-default-0\"]/div/div/div/div/div[1]"));
    }

    public WebElement confirmRoom()
    {
        return Hooks.driver.findElement(By.cssSelector("button.button--primary[type='submit']"));
    }

    public WebElement selectGuest() throws InterruptedException {
        Thread.sleep(2000);
        return Hooks.driver.findElement(By.cssSelector("button.n-button.n-button--primary"));
    }

    public WebElement enterGuestID()
    {
        return Hooks.driver.findElement(By.cssSelector("input.form-control[placeholder='ID Number']"));
    }

    public WebElement selectMyGuestResult() throws InterruptedException {
        Thread.sleep(2000);
        return Hooks.driver.findElement(By.xpath("//div[contains(@class, 'u-align-center') and span[text()='My Guest']]"));
    }

    public WebElement selectGuestConfirmBtn()
    {
        return Hooks.driver.findElement(By.xpath("//button[contains(@class, 'n-button--primary') and contains(text(), 'Confirm')]"));
    }

    public void reservationCreated() throws InterruptedException {
        Thread.sleep(2000);

        SoftAssert softAssert = new SoftAssert();

        boolean reservation = Hooks.driver.findElement(By.xpath("//div[contains(@class, 'res-guest margin-0 ng-star-inserted')]")).isDisplayed();
        softAssert.assertTrue(reservation);

        softAssert.assertAll();
    }
}
