package es.pildoras.prubaannotations;

import org.springframework.stereotype.Component;

@Component("InformeFinancieroTrim3")
public class InformeFinancieroTrim3 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentacion de informe favorable del trimestre 3";
	}

}
