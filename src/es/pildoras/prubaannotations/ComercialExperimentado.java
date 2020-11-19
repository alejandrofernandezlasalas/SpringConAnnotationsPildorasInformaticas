package es.pildoras.prubaannotations;

import org.springframework.stereotype.Component;

@Component("ComercialExperimentado")//Registra este Bean
public class ComercialExperimentado implements Empleados{

	@Override
	public String getTareas() {
	
		return "Vender, vender y vender mas!";
	}

	@Override
	public String getInforme() {
	
		return "Informe generado por el comercial";
	}

}
