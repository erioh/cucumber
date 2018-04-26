package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverContainer {
    private static final WebDriver CHROME_DRIVER = new ChromeDriver();

    private DriverContainer() {}

    public static WebDriver getChromeDriver() {
        return CHROME_DRIVER;
    }
}
