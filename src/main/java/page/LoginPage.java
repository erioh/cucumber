package page;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
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
        this.driver = driver;
    }

    public HomePage clickLoginButton() {
        loginButton.click();
        return PageFactory.initElements(driver, HomePage.class);
    }

    public LoginPage setUsername(String username) {
        usernameField.sendKeys(username);
        return this;
    }

    public LoginPage setPassword(String password) {
        passwordField.sendKeys(password);
        return this;
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
