package co.com.udea.certificacion.gestiondevuelosa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import static co.com.udea.certificacion.gestiondevuelosa.userinterfaces.AircraftPage.CONFIRMATION_POPUP_MSG;

public class CreateAircraftValidation implements Question<String> {
    public CreateAircraftValidation(){}

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(CONFIRMATION_POPUP_MSG).getText();
    }

    public static CreateAircraftValidation getConfirmationMsg(){
        return new CreateAircraftValidation();
    }
}