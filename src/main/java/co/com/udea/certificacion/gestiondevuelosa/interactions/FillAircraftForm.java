package co.com.udea.certificacion.gestiondevuelosa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.udea.certificacion.gestiondevuelosa.userinterfaces.AircraftPage.*;


public class FillAircraftForm implements Interaction {



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("").into(AIRCRAFT_FAMILY_INPUT));
        actor.attemptsTo(Enter.theValue("").into(AIRCRAFT_MODEL_INPUT));
        actor.attemptsTo(Enter.theValue("").into(AIRCRAFT_CAPACITY));

    }
    public static FillAircraftForm withEmptyStrings(){
        return Tasks.instrumented(FillAircraftForm.class);
    }
}