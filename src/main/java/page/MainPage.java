package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {

    @FindBy(xpath = "//td[@class='login-info-left']/span[@class='italic']")
    WebElement loggedAsElement;

    public String loggedAs() {
        return loggedAsElement.getText();
    }
    public boolean isOnPage() {
        return !loggedAs().isEmpty();
    }
}