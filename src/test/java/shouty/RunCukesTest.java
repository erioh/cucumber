package shouty;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        snippets = SnippetType.CAMELCASE
        ,glue = "shouty"
//        ,tags = {"@ext-smoke", "@smoke"}
//        ,features="./src/test/resources/shouty/shout.feature"
)
public class RunCukesTest {
}
