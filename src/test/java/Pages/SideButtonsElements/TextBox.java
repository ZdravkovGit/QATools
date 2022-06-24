package Pages.SideButtonsElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class TextBox {
    public WebDriver driver;
    public WebDriverWait wdwait;
    public WebElement fullName;
    public WebElement email;
    public WebElement currentAddress;
    public WebElement Address;
    public WebElement submit;
    public WebElement UserData;
    public WebElement nameAfterSubmit;
    public WebElement emailAfterSubmit;
    public WebElement currentAddressAfterSubmit;
    public WebElement PermaAddressAfterSubmit;
    public List<WebElement> CurrentAddressData;
    public List<WebElement> PermaAddressData;

    public TextBox(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getFullName() {
        return driver.findElement(By.id("userName"));
    }

    public WebElement getEmail() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getCurrentAddress() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getNameAfterSubmit() {
        return driver.findElement(By.id("name"));
    }

    public WebElement getEmailAfterSubmit() {
        return driver.findElement(By.id("email"));

    }

    public List<WebElement> getCurrentAddressData() {
        return driver.findElements(By.id("currentAddress"));
    }

    public WebElement getCurrentAddressAfterSubmit(String element) {
            for (int i = 1; i < getCurrentAddressData().size(); i++) {
                if (getCurrentAddressData().get(getCurrentAddressData().size() - 1).getText().equals(element)) {
                    getCurrentAddressData().get(getCurrentAddressData().size() - 1).click();
                }
            } return getCurrentAddress();
    }

        public WebElement getPermaAddressAfterSubmit (String element) {
            for (int i = 1; i < getCurrentAddressData().size(); i++) {
                if (getCurrentAddressData().get(getCurrentAddressData().size() - 1).getText().equals(element)) {
                 getCurrentAddressData().get(getCurrentAddressData().size() - 1).click();
                }
            }
            return getCurrentAddress();
}

        public WebElement getAddress () {
            return driver.findElement(By.id("permanentAddress"));
        }
        public WebElement getSubmit () {
            return driver.findElement(By.id("submit"));
        }
        public WebElement getUserData () {
            return driver.findElement(By.className("mb-1"));
        }


        public void CurrentAddressInput (String element){
            for (int i = 1; i < getCurrentAddressData().size(); i++) {
                if (getCurrentAddressData().get(getCurrentAddressData().size() - 1).getText().equals(element)) {
                    getCurrentAddressData().get(getCurrentAddressData().size() - 1).click();
                }
            }
        }
        public List<WebElement> getPermaAddressData () {
            return driver.findElements(By.id("permanentAddress"));
        }


        public void PermaAddressInput (String element){
            for (int i = 0; i < getPermaAddressData().size(); i++) {
                if (getPermaAddressData().get(getPermaAddressData().size() - 1).getText().equals(element)) {
                    getPermaAddressData().get(getPermaAddressData().size() - 1).click();
                }
            }
        }


    }

