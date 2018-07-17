package ashipovalov;


import container.DriverContainer;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.HomePage;
import page.LoginPage;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class LoginStepdefs {
    private LoginPage loginPage;
    private HomePage homePage;
    private DriverContainer container;

    @Before
    public void before() {
        container = DriverContainer.getInstance();
        container.get("http://shipovalov.net/");

    }

    @After
    public void after() {
        container.manage().deleteAllCookies();
        container.get("http://shipovalov.net/");
        container.clickToDie();
    }

    @Given("^User is on the Login page$")
    public void user_is_on_the_Login_page() {
        loginPage = PageFactory.initElements(container.getDriver(), LoginPage.class);
    }

    @When("^User enter \"([^\"]*)\" into Username field$")
    public void i_enter_into_Username_field(String username) {
        loginPage.setUsername(username);
    }

    @When("^User enter \"([^\"]*)\" into Password field$")
    public void i_enter_into_Password_field(String password) {
        loginPage.setPassword(password);
    }

    @When("^Push Login button$")
    public void push_button() {
        homePage = loginPage.clickLoginButton();
    }

    @Then("^User is logged in as \"([^\"]*)\"$")
    public void user_is_logged_in_as(String username) {
        assertEquals(username, homePage.loggedAs());
    }

    @Then("^Error message appears$")
    public void error_message_appears() {
        assertTrue(loginPage.isErrorMessageAppears());
    }


}
