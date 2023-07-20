package mx.Uriel.ConvesorDeDivisas;

import javax.swing.JOptionPane;

public class EntradaDeValor
{

	public static void MostrarVentana()
	{	
		//El tipo de divisa que uso como base para convertir es el peso mexica
		JOptionPane.showInputDialog(null,"Ingresa la cantidad de dinero que deseas convetir: ",
				"Entrada de valor",JOptionPane.QUESTION_MESSAGE);
	}

}
