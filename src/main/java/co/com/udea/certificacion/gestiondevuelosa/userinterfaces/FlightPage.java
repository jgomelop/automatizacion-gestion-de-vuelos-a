package co.com.udea.certificacion.gestiondevuelosa.userinterfaces;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FlightPage extends PageObject {
  public static final Target FLIGHT_CARD = Target.the("Flight card")
      .located(By.xpath(
          "//*[@id=\"__next\"]/div/section/div[2]/div[1]"));

  public static final Target FLIGHT_ID = Target.the("Flight ID")
      .located(By.id("flightId"));

  public static final Target DEPARTURE_CITY = Target.the("Departure city")
      .located(By.id("departureCity"));

  public static final Target PRICE = Target.the("Flight price")
      .located(By.id("flightPrice"));
}
