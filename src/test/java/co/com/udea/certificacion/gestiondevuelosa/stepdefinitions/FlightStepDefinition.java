package co.com.udea.certificacion.gestiondevuelosa.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.udea.certificacion.gestiondevuelosa.questions.FlightDetails;
import co.com.udea.certificacion.gestiondevuelosa.tasks.GoToFlightPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static org.hamcrest.Matchers.is;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.*;

public class FlightStepDefinition {
  private Actor admin = Actor.named("administrator");

  @Managed(driver = "chrome", uniqueSession = true)
  public WebDriver theDriver;

  @Before
  public void setup() {
    admin.can(BrowseTheWeb.with(theDriver));
    setTheStage(new OnlineCast());
  }

  @Given("I am an administrator and can use the system")
  public void iAmAdministrator() {
    OnStage.setTheStage(new OnlineCast());
    admin = OnStage.theActorCalled("administrator");
  }

  @When("I visit the flight page")
  public void iVisitFlightPage() {
    admin.attemptsTo(
        GoToFlightPage.at("https://code-factory-presencial-front-nine.vercel.app/gestion-de-vuelos-A/vuelos"));
  }

  @Then("I can see the list of flights with it flightId")
  public void iCanSeeTheListOfFlightsWithItFlightId(DataTable dataTable) {
    List<String> details = dataTable.asList(String.class);
    for (String detailType : details) {
      admin.should(seeThat(FlightDetails.contains(detailType), is(true)));
    }
  }

}
