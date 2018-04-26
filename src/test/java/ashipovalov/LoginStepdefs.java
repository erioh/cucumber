package ashipovalov;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import factory.DriverContainer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.LoginPage;
import page.MainPage;

import static junit.framework.TestCase.assertEquals;

public class LoginStepdefs {
    private LoginPage loginPage;
    private MainPage mainPage;
    @Before
    public void before(){
        WebDriver driver = DriverContainer.getChromeDriver();
        loginPage = PageFactory.initElements(driver, LoginPage.class);
    }
    @Given("^User is on the Login page$")
    public void user_is_on_the_Login_page() {
        loginPage.open();
    }

    @When("^I enter \"([^\"]*)\" into Username field$")
    public void i_enter_into_Username_field(String username) {
        loginPage.setUsername(username);
    }

    @When("^I enter \"([^\"]*)\" into Password field$")
    public void i_enter_into_Password_field(String password) {
        loginPage.setPassword(password);
    }

    @When("^Push button \"([^\"]*)\"$")
    public void push_button(String arg1) {
        mainPage = loginPage.clickLoginButton();
    }

    @Then("^User is logged in as \"([^\"]*)\"$")
    public void user_is_logged_in_as(String username) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(username, mainPage.loggedAs()) ;
    }

}
