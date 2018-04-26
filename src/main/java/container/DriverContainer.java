package container;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverContainer {
    private DriverContainer() {
    }

    public static WebDriver getDriver() {
        return new ChromeDriver();
    }

}
