package es.pildoras.prubaannotations;

import org.springframework.stereotype.Component;

@Component("InformeFinancieroTrim4")
public class InformeFinancieroTrim4 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentacion de informe de cierre del año";
	}

}
