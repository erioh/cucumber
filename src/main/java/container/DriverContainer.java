package container;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverContainer {
    private final WebDriver CHROME_DRIVER = new ChromeDriver();
    private static final DriverContainer DRIVER_CONTAINER;
    private int click;

    static {
        DRIVER_CONTAINER = new DriverContainer();
    }

    private DriverContainer() {
    }

    public static DriverContainer getInstance() {
        return DRIVER_CONTAINER;
    }

    public WebDriver getDriver() {
        return CHROME_DRIVER;
    }

    public void get(String url) {
        CHROME_DRIVER.get(url);
    }

    public WebDriver.Options manage() {
        return CHROME_DRIVER.manage();
    }

    public void clickToDie() {
        click++;
        if(click == 18) {
            getDriver().quit();
        }
    }
}
