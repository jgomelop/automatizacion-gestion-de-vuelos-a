package co.com.udea.certificacion.gestiondevuelosa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class GoToFlightPage implements Task {
  private final String url;

  public GoToFlightPage(String url) {
    this.url = url;
  }

  public static GoToFlightPage at(String url) {
    return new GoToFlightPage(url);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Open.url(url));
  }
}
