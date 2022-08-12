package vista;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class PanelC2 extends JPanel{
	
	public PanelC2() {
		setLayout(new BorderLayout());
		
		setVisible(true);
	}

	public void inicializarComp(){
		PanelC2_1 pc2_1 = new PanelC2_1();
		add(pc2_1, BorderLayout.NORTH);
		
		PanelC2_2 pc2_2 = new PanelC2_2();
		add(pc2_2, BorderLayout.CENTER);
		
		
	}
}
