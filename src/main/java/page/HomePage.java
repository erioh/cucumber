package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//td[@class='login-info-left']/span[@class='italic']")
    private WebElement loggedAsElement;

    @FindBy(xpath = "//a[@href='/bug_report_page.php']")
    private WebElement reportIssueLink;

    public String loggedAs() {
        return loggedAsElement.getText();
    }
    public boolean isOnPage() {
        return !loggedAs().isEmpty();
    }

    public NewReportPage clickReportIssueLink() {
        reportIssueLink.click();
        return PageFactory.initElements(driver, NewReportPage.class);
    }
}