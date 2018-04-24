package shouty;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import entity.Person;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class Stepdefs {
    private Person lucy = new Person("Lucy");
    private Person shon = new Person("Shon");
    private String expectedMessageFromShon;
    private int expectedDistance;
    
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
        assertEquals(asList(expectedMessageFromShon), lucy.getMessageHeard());
    }

}
