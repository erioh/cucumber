package ashipovalov;

import container.DriverContainer;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import entity.Report;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import page.HomePage;
import page.LoginPage;
import page.NewReportPage;
import page.ViewIssuesPage;

import static junit.framework.TestCase.assertTrue;

public class CreateReportStepdefs  {
    private HomePage homePage;
    private NewReportPage newReportPage;
    private ViewIssuesPage viewIssuesPage;
    private Report report;
    DriverContainer container;
    @Before
    public void before(){
        container = DriverContainer.getInstance();
        container.get("http://shipovalov.net/");
    }

    @After
    public void after() {
        container.manage().deleteAllCookies();
        container.get("http://shipovalov.net/");
        container.clickToDie();
    }

    @Given("^User is on the HomePage logged as user \"([^\"]*)\" with password \"([^\"]*)\"$")
    public void user_is_on_the_HomePage_logged_as_user_with_password(String username, String password) {
        homePage = PageFactory.initElements(container.getDriver(), LoginPage.class)
                .setUsername(username).setPassword(password).clickLoginButton();
    }

    @When("^User click Report Issue link$")
    public void user_click_Report_Issue_link() {
        newReportPage = homePage.clickReportIssueLink();
    }

    @When("^User fill all mandatory fields$")
    public void user_fill_all_mandatory_fields() {
        report = new Report();
        report.setSummary("Summary");
        report.setCategory("someCategory");
        report.setDescription("Some Description");
        newReportPage.setCategory(report)
                .setDescriptionTextField(report)
                .setSummaryTextField(report);
    }

    @When("^User click Submit Report Button$")
    public void user_click_Submit_Report_Button() {
        viewIssuesPage = newReportPage.clickSubmitReportButton();
    }

    @Then("^Report is submitted successfully$")
    public void report_is_submitted_successfully() {
        assertTrue(viewIssuesPage.isReportPresent(report));
    }


}
