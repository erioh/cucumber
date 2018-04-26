package page;

import entity.Report;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewReportPage {

    private WebDriver driver;

    @FindBy(name = "category_id")
    private WebElement categorySelectWebElement;

    @FindBy(name = "summary")
    private WebElement summaryTextField;

    @FindBy(name = "description")
    private WebElement descriptionTextField;

    @FindBy(css = "input.button")
    private WebElement submitReport;

    public NewReportPage(WebDriver driver) {
        this.driver = driver;
    }

    public NewReportPage setCategory(Report report) {
        Select categorySelect = new Select(categorySelectWebElement);
        categorySelect.selectByVisibleText(report.getCategory());
        return this;
    }

    public NewReportPage setSummaryTextField(Report report) {
        summaryTextField.sendKeys(report.getSummary());
        return this;
    }

    public NewReportPage setDescriptionTextField(Report report) {
        descriptionTextField.sendKeys(report.getDescription());
        return this;
    }

    public ViewIssuesPage clickSubmitReportButton() {
        submitReport.click();
        return PageFactory.initElements(driver, ViewIssuesPage.class);
    }
}
