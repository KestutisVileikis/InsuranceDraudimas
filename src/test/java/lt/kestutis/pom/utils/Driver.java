package lt.kestutis.pom.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Driver {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void setDriver() {

        WebDriverManager.chromedriver().setup();
        driver.set(new ChromeDriver(getDriverOptions()));
        driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    private static ChromeOptions getDriverOptions() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=2000,3000");
        options.addArguments("--force-device-scale-factor=0.75");
        return options;
    }

    public static void quitDriver() {
        driver.get().quit();
        driver.remove();
    }
}
