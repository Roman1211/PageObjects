package app;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CartPage;
import pages.ItemPage;
import pages.MainPage;

import java.io.File;
public class Application {
    private WebDriver driver;
    private MainPage mainPage;
    private ItemPage itemPage;
    private CartPage cartPage;


    public Application() {
        driver = new ChromeDriver();
        mainPage = new MainPage(driver);
        itemPage = new ItemPage(driver);
        cartPage = new CartPage(driver);
    }


    public void addItemToCart() {
        mainPage.open();
        mainPage.item.click();
        itemPage.selectSize();
        itemPage.addItem();
    }
    public void deleteItems() throws InterruptedException {
        cartPage.open();
        cartPage.removeItems();
    }


    public void quit() {
        driver.quit();
    }

    public void addItem() {

    }
}
