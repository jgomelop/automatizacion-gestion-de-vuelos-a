package co.com.udea.certificacion.gestiondevuelosa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.udea.certificacion.gestiondevuelosa.userinterfaces.AircraftPage.*;


public class ClickOnCreateAircraftBtn implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CREATE_AIRCRAFT_BTN));
    }
    public static ClickOnCreateAircraftBtn click(){
        return Tasks.instrumented(ClickOnCreateAircraftBtn.class);
    }
}