package shouty;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumStepdefs {
    WebDriver driver = new ChromeDriver();

    @Given("^I'm on Google search page$")
    public void i_m_on_Google_search_page() {
        // Write code here that turns the phrase above into concrete actions
        driver.get("http://google.com");
    }

    @When("^I search for \"([^\"]*)\"$")
    public void i_search_for(String arg1) {
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(arg1);
        element.submit();
    }

    @Then("^The page title should start with \"([^\"]*)\"$")
    public void the_page_title_should_start_with(String arg1) {
        new WebDriverWait(driver, 10).until((ExpectedCondition<Boolean>) webDriver -> webDriver.getTitle().startsWith(arg1));
    }

    @After
    public void closeBrauser() {
        driver.close();
    }

}
