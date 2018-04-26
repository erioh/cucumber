package shouty;

import cucumber.api.Format;
import cucumber.api.Transpose;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import entity.Person;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Stepdefs {
    private Person lucy = new Person("Lucy");
    private Person shon = new Person("Shon");
    private String expectedMessageFromShon;
    private int expectedDistance;
    private SupportShout supportShout;

    public Stepdefs(SupportShout supportShout) {
        this.supportShout = supportShout;
    }

    @Before
    public void beforeTest() {
        System.out.println("Before test");
    }

    @After
    public void afterTest() {
        System.out.println("After test");
    }

    @Given("^Lucy is (\\d+) meters from Shon$")
    public void lucyIsMetersFromShon(int distance) throws Throwable {
        expectedDistance = distance;
        lucy.setDistanceTo(distance, shon);
    }

    @When("^Shon says \"([^\"]*)\"$")
    public void shonSays(String message) throws Throwable {
        assertEquals(expectedDistance, lucy.getDistanceTo(shon));
        assertEquals(expectedDistance, shon.getDistanceTo(lucy));
        shon.shout(message);
        lucy.addHeardedMessageList(message);
        expectedMessageFromShon = message;
    }

    @Then("^Lucy should hear Shon's message$")
    public void lucyShouldHearShonSMessage() throws Throwable {
        assertEquals(Collections.singletonList(expectedMessageFromShon), lucy.getMessageHeard());
    }

    @Given("^user is displayed login screen$")
    public void userIsDisplayedLoginScreen() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^we verify following user exists$")
    public void weVerifyFollowingUserExists(List<User> userList) {
        System.out.println(userList);
    }

    @Then("^we verify following user exists2$")
    public void weVerifyFollowingUserExists2(@Transpose List<User> userList) {
        System.out.println(userList);
    }

    @Given("^Hello World$")
    public void helloWorld() throws Throwable {
        System.out.println("Hello world");
        ;
    }

    @Given("^My Birthday is on \"([^\"]*)\"$")
    public void myBirthdateIsOn(@Format("dd-MM-yyyy") Date date) throws Throwable {
        System.out.println(date);
        System.out.println(date.getClass());
    }

    private class User {
        String name;
        String email;

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("User{");
            sb.append("name='").append(name).append('\'');
            sb.append(", email='").append(email).append('\'');
            sb.append('}');
            return sb.toString();
        }
    }


}
