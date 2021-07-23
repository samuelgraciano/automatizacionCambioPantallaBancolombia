package co.com.cambioPagina.tasks;

import co.com.devco.automation.mobile.actions.WaitFor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;


import static co.com.cambioPagina.userinterfaces.GoogleSearchPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CambiarPaginaEnBancolombia implements Task {


    public CambiarPaginaEnBancolombia() {

    }

    public static Performable botonSolicitarProductos() {

        return instrumented(CambiarPaginaEnBancolombia.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Switch.toTheOtherWindow(),
                WaitFor.seconds(5),
                Click.on(BOTON_SOLICITAR_PRODUCTO)
                );

    }
}
