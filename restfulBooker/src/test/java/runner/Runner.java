package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "pretty",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = {"steps"},
        features = {"src/test/resources/features/"},
        dryRun = false,
        monochrome = true
)
public class Runner {
}
