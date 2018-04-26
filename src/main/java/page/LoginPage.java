package page;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private String link = "http://shipovalov.net/";
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "input.button")
    private WebElement loginButton;

    @FindBy(name = "username")
    private WebElement usernameField;

    @FindBy(name = "password")
    private WebElement passwordField;

    public LoginPage(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public LoginPage() {

    }

    public LoginPage open() {
        driver.get(link);
        return this;
    }

    public MainPage clickLoginButton() {
        loginButton.click();
        return PageFactory.initElements(driver, MainPage.class);
    }

    public LoginPage setUsername(String username) {
        usernameField.sendKeys(username);
        return this;
    }

    public LoginPage setPassword(String password) {
        passwordField.sendKeys(password);
        return this;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
