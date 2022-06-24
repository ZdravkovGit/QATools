package Pages.SideButtonsElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.List;

public class CheckBox {
    public WebDriver driver;
    public WebDriverWait wdwait;
    public WebElement CheckBoxButton;
    public WebElement ArrowDown;
    public List<WebElement> ListOfItems;
    public List<WebElement> ListOfToggles;

    public CheckBox(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }
    public WebElement CheckBoxButton() {
        return driver.findElement(By.className("rct-checkbox"));
    }
    public List<WebElement> ListOfToggles() {
        return driver.findElements(By.cssSelector(".rct-icon.rct-icon-expand-open"));
    }
    public WebElement ToggleDown() {
        return driver.findElement(By.cssSelector(".rct-icon.rct-icon-expand-close"));
    }


    public List<WebElement> getListOfItems() {
        return driver.findElements(By.className("rct-title"));
    }
    public void ItemFromTheList(String item) {
        for (int i =0; i<getListOfItems().size(); i++) {
            if (getListOfItems().get(i).getText().equals(item)) {
                getListOfItems().get(i).click();
            }
        }

    }
}
