package page;

import entity.Report;
import entity.ShortReport;
import extractor.ShortReportWebElementExtractor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ViewIssuesPage {

    private ShortReportWebElementExtractor extractor = new ShortReportWebElementExtractor();

    @FindBy(xpath = "//table[@id='buglist']/tbody/tr[not(@class='spacer' or @class='row-category')][@bgcolor]")
    private List<WebElement> reportList;

    private WebDriver driver;

    public ViewIssuesPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isReportPresent(Report report) {
        new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOfAllElements(reportList));
        boolean reportIsPresent = false;
        ShortReport expectedReport = new ShortReport(report);
        for (WebElement reportFromList : reportList) {
            ShortReport extractedReport = extractor.extract(reportFromList);
            if (expectedReport.equals(extractedReport)) {
                reportIsPresent = true;
                break;
            }

        }
        return reportIsPresent;

    }
}
