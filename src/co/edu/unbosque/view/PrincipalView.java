package co.edu.unbosque.view;

import javax.swing.*;


public class PrincipalView extends JFrame {

	private JMenuBar elemento;

	private JPanel panel;

	private JMenu empleado;
	private JMenu cliente;
	private JMenu juego;
	private JMenu info;

	private JMenuItem infoAdministracion;

	public PrincipalView() {
		setTitle("Dinamica");
		setSize(700, 500);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		inicializar();

	}

	private void inicializar() {

		elemento = new JMenuBar();
		setJMenuBar(elemento);

		empleado = new JMenu();
		elemento.add(empleado);

		infoAdministracion = new JMenuItem("Informacion Empleado");
		empleado.add(infoAdministracion);



	}
	

}
