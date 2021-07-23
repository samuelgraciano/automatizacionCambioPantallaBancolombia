package co.com.cambioPagina.stepdefinitions;

import co.com.cambioPagina.tasks.BuscarEnBancolombia;
import co.com.cambioPagina.tasks.CambiarPaginaEnBancolombia;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.cambioPagina.userinterfaces.GoogleResultadosPage.PRIMER_RESULTADO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BancolombiaSearchStepDefinitions {

    @Cuando("^(.*) quiere cambiar de pagina$")
    public void BuscaBancolombia(String actor) {
        theActorCalled(actor).attemptsTo(
                BuscarEnBancolombia.elBoton()
        );
    }

    @Entonces("^debe encontrar un cambio de pagina e interactura$")
    public void debeEncotrarCambioPagina() {
        theActorInTheSpotlight().attemptsTo(CambiarPaginaEnBancolombia.botonSolicitarProductos());

    }
}
