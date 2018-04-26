package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverContainer {
    private static final WebDriver CHROME_DRIVER = new ChromeDriver();

    private DriverContainer() {}

    public static WebDriver getDriver() {
        return CHROME_DRIVER;
    }

}
