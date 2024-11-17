package co.com.udea.certificacion.gestiondevuelosa.userinterfaces;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AircraftPage extends PageObject {
    public static final Target CREATE_FORM_DIV = Target.the("Create aircraft form")
            .located(By.xpath(
                    "//*[@id=\"__next\"]/div/div"));

    public static final Target AIRCRAFT_FAMILY_INPUT = Target.the("CREATE AIRCRAFT FAMILY INPUT")
            .located(By.xpath("//*[@id=\":r0:-form-item\"]"));

    public static final Target AIRCRAFT_MODEL_INPUT = Target.the("CREATE AIRCRAFT MODEL INPUT")
            .located(By.xpath("//*[@id=\":r1:-form-item\"]"));

    public static final Target AIRCRAFT_CAPACITY = Target.the("CREATE AIRCRAFT CAPACITY")
            .located(By.xpath("//*[@id=\":r2:-form-item\"]"));

    public static final Target CREATE_AIRCRAFT_BTN = Target.the("CREATE AIRCRAFT BUTTON")
            .located(By.xpath("//*[@id=\"__next\"]/div/div/button"));

    public static final Target CONFIRMATION_POPUP_MSG = Target.the("CREATE AIRCRAFT MESSAGE")
            .located(By.cssSelector("#radix-\\:r8\\:"));


}
