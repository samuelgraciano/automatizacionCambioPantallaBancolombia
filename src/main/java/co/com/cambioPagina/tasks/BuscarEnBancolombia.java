package co.com.cambioPagina.tasks;

import co.com.devco.automation.mobile.actions.WaitFor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.cambioPagina.userinterfaces.GoogleResultadosPage.RESULTADOS_BUSQUEDA;
import static co.com.cambioPagina.userinterfaces.GoogleSearchPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BuscarEnBancolombia implements Task {


    public BuscarEnBancolombia() {

    }

    public static Performable elBoton() {

        return instrumented(BuscarEnBancolombia.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(BANCOLOMBIA_HOME_PAGE),
                Click.on(BOTON_CONOCE_COMO),
                WaitFor.seconds(4)
        );
    }
}
