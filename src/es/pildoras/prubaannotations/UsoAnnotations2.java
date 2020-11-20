package es.pildoras.prubaannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		Empleados antonia = contexto.getBean("ComercialExperimentado", Empleados.class);
		Empleados lucia = contexto.getBean("ComercialExperimentado", Empleados.class);
		
		if(antonia == lucia)
			System.out.println("Apunta al mismo sitio en memoria");
		else
			System.out.println("Apunta a sitios diferentes de memoria");
		
		contexto.close();
	}
}
