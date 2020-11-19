package es.pildoras.prubaannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Empleados antonia = contexto.getBean("ComercialExperimentado", Empleados.class);
		
		System.out.println(antonia.getInforme());
		System.out.println(antonia.getTareas());
		
		contexto.close();
		
	}

}
