package co.com.cambioPagina.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/bancolombia_search.feature",
		glue = {"co.com.cambioPagina.stepdefinitions"},
		snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class GoogleSearchRunner {

}
