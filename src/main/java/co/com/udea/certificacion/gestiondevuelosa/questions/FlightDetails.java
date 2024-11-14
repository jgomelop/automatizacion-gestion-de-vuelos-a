package co.com.udea.certificacion.gestiondevuelosa.questions;

import co.com.udea.certificacion.gestiondevuelosa.userinterfaces.FlightPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class FlightDetails implements Question<Boolean> {
  private final String detailType;

  public FlightDetails(String detailType) {
    this.detailType = detailType;
  }

  public static FlightDetails contains(String detailType) {
    return new FlightDetails(detailType);
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    switch (detailType) {
      case "flightId":
        return FlightPage.FLIGHT_ID.resolveFor(actor).isVisible();
      case "departureCity":
        return FlightPage.DEPARTURE_CITY.resolveFor(actor).isVisible();
      case "flightPrice":
        return FlightPage.PRICE.resolveFor(actor).isVisible();
      default:
        return false;
    }
  }
}
