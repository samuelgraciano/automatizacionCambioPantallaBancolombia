package co.com.cambioPagina.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GoogleSearchPage {
	public static final String BANCOLOMBIA_HOME_PAGE = "https://www.grupobancolombia.com/personas";
	public static final Target CAMPO_BUSQUEDA = Target.the("Campo de busqueda en Google").located(By.xpath("//input[@title='Buscar']"));
	public static final Target BOTON_CONOCE_COMO = Target.the("esta en home de bancolombia").located(By.xpath("//*[@id='layoutContainers']/div/div[2]/div/div[9]/section/div[3]/section/div/div/div[2]/a"));
	public static final Target BOTON_SOLICITAR_PRODUCTO = Target.the("boton que se encuentra en la segunda pagina de bancolombia").located(By.xpath("//*[@id='old-headerMain']/div[2]/div[1]/div/a"));


}
