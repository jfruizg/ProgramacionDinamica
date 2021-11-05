package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.PrincipalView;

public class controller implements ActionListener {

	private PrincipalView vista;
	
	public  controller() {
		// TODO Auto-generated constructor stub
		vista = new PrincipalView(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==vista.getFloyd()) {
			System.out.println("Algoritmo de Floyd");
        }
        if (e.getSource()==vista.getViajero()) {
    		System.out.println("El problema del viajero");
        }
        if (e.getSource()==vista.getMatrices()) {
        	System.out.println("Multiplicación de matrices");
        }
        if (e.getSource()==vista.getAsignaciónTareas()) {
          	System.out.println("El problema de asignación de tareas");
        }
        if (e.getSource()==vista.getCoeficientesBinomiales()) {
          	System.out.println("Coeficientes Binomiales");
        }
	}
}
