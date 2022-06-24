package Base;

import Pages.HomePage;
import Pages.SideBar;
import Pages.SideButtonsElements.CheckBox;
import Pages.SideButtonsElements.TextBox;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.List;

public class BaseBase {
    //Uvod: Tokom testiranja koristim IntelliJ Idea u kome kreiram Maven projekat iz razloga sto mi je lakse da ubacujem biblioteke preko pom fajla
    //Prilikom testiranja koristim POM jer je laksi za odrzavanje, lakse se prati rad i elementi se definisu na samo jednom mestu
    //Koristim i JUnit kako ne bih morao da ponavljam neke blokove koda i koristim Before, After i Test anotacije-------------------
    //Mogu i da koristim TestNG ali sam izabrao JUnit----------------------------------------------------------------------------------
    //Da izbegnem hardkodiranje koristim DataDrivenTesting kako lakse mogu da menjam/dodajem testne podatke ili uporedjujem dobijeni rezultat sa ocekivanim rezultatom
    //Testiranje vrsim na Chrome browseru jer prema izvoru Chrome koristi trenutno 67% korisnika na svetu preko Desktopa
    //Izvor: https://gs.statcounter.com/browser-market-share/desktop/worldwide
    //Ako bude potrebe da se testira i na drugim browserima samo treba zameniti driver i ubaciti u directory. Na primer gecko driver za Firefox.
    //U ovom ispod delu deklarisem driver, webdriverwait ako bude potrebe i sve stranice koje cu da testiram
   public WebDriver driver;
   public WebDriverWait wdwait;
   public HomePage homePage;
   public SideBar sideBar;
   public TextBox textBox;
   public CheckBox checkBox;

    @BeforeClass
    public void SetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        homePage = new HomePage(driver, wdwait);
        sideBar = new SideBar(driver,wdwait);
        textBox = new TextBox(driver,wdwait);
        checkBox = new CheckBox(driver,wdwait);

    }

    public void scrollIntoView() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
    }

}
