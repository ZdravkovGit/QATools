package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement ElementsButton;
    WebElement FormsButton;
    WebElement AFWbutton;
    WebElement WidgetsButton;
    WebElement InteractionsButton;
    WebElement BookStoreButton;

    public HomePage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getElementsButton() {
        return driver.findElement(By.xpath("//*[text()='Elements']"));
    }

    public WebElement getFormsButton() {
        return driver.findElement(By.xpath("//*[text()='Forms']"));
    }

    public WebElement getAFWbutton() {
        return driver.findElement(By.xpath("//*[text()='Alerts, Frame & Windows']"));
    }

    public WebElement getWidgetsButton() {
        return driver.findElement(By.xpath("//*[text()='Widgets']"));
    }

    public WebElement getInteractionsButton() {
        return driver.findElement(By.xpath("//*[text()='Interactions']"));
    }

    public WebElement getBookStoreButton() {
        return driver.findElement(By.xpath("//*[text()='Book Store Application']"));
    }


}
