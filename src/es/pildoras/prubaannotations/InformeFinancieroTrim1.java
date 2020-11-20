package es.pildoras.prubaannotations;

import org.springframework.stereotype.Component;

@Component("InformeFinancieroTrim1")//Registarmos esta clase en el contenedor de Bean
public class InformeFinancieroTrim1 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentacion de informe financiero del trimestre 1";
	}

}
