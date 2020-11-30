package tests;
import app.Application;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class BaseTest {
    public Application app;
    public WebDriver driver;
    public WebDriverWait wait;

    @Before
    public void start() {
        app = new Application();

    }


}