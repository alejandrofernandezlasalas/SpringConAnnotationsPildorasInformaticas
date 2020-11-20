package es.pildoras.prubaannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ComercialExperimentado")//Registra esta clase en el contenedor del Bean
@Scope("prototype")//Indicamos que vamos a trabajar con el patron Prototype
public class ComercialExperimentado implements Empleados{

	@Autowired//Aplica el concepto de Reflexion  para aplicar un control de dependencia
	@Qualifier("InformeFinancieroTrim4")//Como tengo varias clases que impelmentan "CreacionInformeFinanciero" debo decirle cual quiero que implemente
	private CreacionInformeFinanciero nuevoInforme;
	
//	@Autowired//Busca alguna clase que implemente "CreacionInformeFinanciero" y cuando la encuentra realiza la inyeccion
//	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
//		this.nuevoInforme = nuevoInforme;
//	}
	
//	@Autowired
//	public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
//		this.nuevoInforme = nuevoInforme;
//	}
	
//	@Autowired//Realiza la ineccion en un metodo cualquiera
//	public void creacionInforme(CreacionInformeFinanciero nuevoInforme) {
//		this.nuevoInforme = nuevoInforme;
//	}

	@Override
	public String getTareas() {
	
		return "Vender, vender y vender mas!";
	}



	@Override
	public String getInforme() {
	
		return nuevoInforme.getInformeFinanciero();
	}

}
