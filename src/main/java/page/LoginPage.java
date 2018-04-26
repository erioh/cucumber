package page;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class LoginPage {
    private String link = "http://shipovalov.net/";
    private WebDriver driver;

    @FindBy(css = "input.button")
    private WebElement loginButton;

    @FindBy(name = "username")
    private WebElement usernameField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(xpath = "//font[@color='red']")
    private WebElement loginErrorMessage;

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

    public boolean isErrorMessageAppears() {
        boolean result = true;
        try {
            new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(loginErrorMessage));
        } catch (TimeoutException e) {
            result = false;
        } finally {
            return result;
        }
    }


}
