package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SideBar {
    WebDriver driver;
    WebDriverWait wdwait;
   public List <WebElement> sidebarButtons;

    public SideBar(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }
    public List<WebElement> getSidebarButtons() {
        return driver.findElements(By.className("text"));
    }
    public void sideBarButton(String element) {
       for (int i = 0; i < getSidebarButtons().size(); i++) {
           if (getSidebarButtons().get(i).getText().equals(element)) {
               getSidebarButtons().get(i).click();
           }
       }
   }


}

