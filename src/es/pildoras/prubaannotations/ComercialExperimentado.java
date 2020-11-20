package es.pildoras.prubaannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ComercialExperimentado")//Registra esta clase en el contenedor del Bean
public class ComercialExperimentado implements Empleados{

	private CreacionInformeFinanciero nuevoInforme;
	
	@Autowired//Busca alguna clase que implemente "CreacionInformeFinanciero" y cuando la encuentra realiza la inyeccion
	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}
	
	@Override
	public String getTareas() {
	
		return "Vender, vender y vender mas!";
	}

	@Override
	public String getInforme() {
	
		return nuevoInforme.getInformeFinanciero();
	}

}
