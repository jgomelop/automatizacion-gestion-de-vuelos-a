package co.com.udea.certificacion.gestiondevuelosa.tasks;

import co.com.udea.certificacion.gestiondevuelosa.interactions.ClickOnCreateAircraftBtn;
import co.com.udea.certificacion.gestiondevuelosa.interactions.FillAircraftForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class FillCreateAircraftForm implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(FillAircraftForm.withEmptyStrings());
        actor.attemptsTo(ClickOnCreateAircraftBtn.click());
    }

    public static FillCreateAircraftForm inputs(){
        return Tasks.instrumented(FillCreateAircraftForm.class);
    }
}
