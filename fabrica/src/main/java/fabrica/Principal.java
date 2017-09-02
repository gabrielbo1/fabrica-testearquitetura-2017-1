package fabrica;


import org.apache.log4j.PropertyConfigurator;
import fabrica.controller.ControllerTarefa;


public class Principal {

	public static void main(String[] args) {
		PropertyConfigurator.configure(ClassLoader.getSystemResource("log4j.properties"));
	    ControllerTarefa.api(args);
	}
}
