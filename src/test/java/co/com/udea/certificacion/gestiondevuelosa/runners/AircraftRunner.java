package co.com.udea.certificacion.gestiondevuelosa.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/create_aircraft.feature",
        glue = "co.com.udea.certificacion.gestiondevuelosa.stepdefinitions.aircraft",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class AircraftRunner {
}
