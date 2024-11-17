package co.com.udea.certificacion.gestiondevuelosa.stepdefinitions.aircraft;

import co.com.udea.certificacion.gestiondevuelosa.questions.CreateAircraftValidation;
import co.com.udea.certificacion.gestiondevuelosa.tasks.FillCreateAircraftForm;
import co.com.udea.certificacion.gestiondevuelosa.tasks.OpenThe;
import co.com.udea.certificacion.gestiondevuelosa.userinterfaces.AircraftPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class AircraftStepDefinition {
    private Actor admin = Actor.named("admin");

    @Managed(driver = "chrome", uniqueSession = true)
    public WebDriver theDriver;

    @Before
    public void setup() {
        admin.can(BrowseTheWeb.with(theDriver));
        setTheStage(new OnlineCast());
    }

    @Given("I am an admin")
    public void iAmAdministrator() {
        OnStage.setTheStage(new OnlineCast());
        admin = OnStage.theActorCalled("admin");
    }

    @Given("Open the aircraft page")
    public void openAircraftPage(){
        admin.attemptsTo(OpenThe.browser(new AircraftPage()));
    }

    @When("I send the form with missing inputs")
    public void iSendTheFormWithMissingInputs() {
        admin.attemptsTo(FillCreateAircraftForm.inputs());
    }

    @Then("I get a message error")
    public void iGetAMessageError() {
        GivenWhenThen.then(admin).should(GivenWhenThen
                .seeThat(
                        CreateAircraftValidation.getConfirmationMsg(),
                        Matchers.containsString(
                                "Error msg")));
    }

}
