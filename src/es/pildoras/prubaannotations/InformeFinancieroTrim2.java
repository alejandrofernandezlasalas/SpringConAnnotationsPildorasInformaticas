package es.pildoras.prubaannotations;

import org.springframework.stereotype.Component;

@Component("InformeFinancieroTrim2")
public class InformeFinancieroTrim2 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentacion de informe dificil del trimestre 2";
	}

}
