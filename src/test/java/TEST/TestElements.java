package TEST;

import Base.BaseBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestElements extends BaseBase {

    String username = "Zdravko Cvorovic";
    String email = "name@mail.com";
    String CurrentAddress = "Topolska 18";
    String PermaAddress = "Soba podstanara";


    @Test
    public void TestTextBox() throws InterruptedException {
        driver.navigate().to("https://demoqa.com/");
        driver.manage().window().maximize();

        scrollIntoView();
        Thread.sleep(1000);
        homePage.getElementsButton().click();
        Thread.sleep(1000);
        sideBar.sideBarButton("Text Box");
        textBox.getFullName().sendKeys(username);
        textBox.getEmail().sendKeys(email);
        textBox.getCurrentAddress().sendKeys(CurrentAddress);
        textBox.getAddress().sendKeys(PermaAddress);
        scrollIntoView();
        textBox.getSubmit().click();
        wdwait.until(ExpectedConditions.visibilityOfElementLocated(By.className("mb-1")));
        Assert.assertTrue(textBox.getUserData().isDisplayed());
        Assert.assertEquals(textBox.getNameAfterSubmit().getText(),"Name:" + username);
        Assert.assertEquals(textBox.getEmailAfterSubmit().getText(),"Email:"+ email);
        //Assert.assertEquals(textBox.getCurrentAddressAfterSubmit(CurrentAddress), "Current Addres :" + CurrentAddress);
        Assert.assertEquals(textBox.getPermaAddressAfterSubmit(PermaAddress).getText(), "Permananet Address :"+PermaAddress);

    }
}
