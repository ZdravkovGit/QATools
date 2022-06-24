package TEST;

import Base.BaseBase;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestCheckBox extends BaseBase {

    @Test
    public void TestForCheckBox() throws InterruptedException {
        driver.navigate().to("https://demoqa.com/");
        driver.manage().window().maximize();


        scrollIntoView();
        homePage.getElementsButton().click();
        sideBar.sideBarButton("Check Box");
        Thread.sleep(1000);
        checkBox.CheckBoxButton().click();
        Thread.sleep(550);
        checkBox.ToggleDown().click();
        checkBox.ToggleDown().click();
        checkBox.ToggleDown().click();
        checkBox.ToggleDown().click();
        checkBox.ToggleDown().click();
        scrollIntoView();
        checkBox.ToggleDown().click();

        

    }
}
