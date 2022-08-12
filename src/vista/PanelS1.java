package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelS1 extends JPanel{
	
	public PanelS1() {
		setLayout(new GridLayout(2,2));

		JButton Agregar = new JButton ("Agregar");
		JButton Eliminar = new JButton ("Eliminar");
		JButton Info = new JButton ("Info. Pokem�n");
		JButton Modificar = new JButton("Modificar");
	
		Agregar.setActionCommand("Agregar");
		Eliminar.setActionCommand("Eliminar");
		Info.setActionCommand("Info");
		Modificar.setActionCommand("Modificar");
		
		add(Agregar);
		add(Eliminar);
		add(Info);
		add(Modificar);
		setVisible(true);
	}

	
}
