package extractor;

import entity.ShortReport;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ShortReportWebElementExtractor {
    public ShortReport extract(WebElement element) {
        ShortReport report = new ShortReport();
        System.out.println(element);
        report.setCategory(element.findElement(By.xpath("td[6]")).getText());
        report.setSummary(element.findElement(By.xpath("td[10]")).getText());
        return report;
    }
}
