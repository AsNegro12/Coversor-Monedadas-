package mx.Uriel.ConvesorDeDivisas;

import javax.swing.JOptionPane;

public class EntradaDeValor
{

	public static void MostrarVentana()
	{
		//El tipo de divisa que uso como base para convertir es el peso mexica
		JOptionPane.showInputDialog(null,"Ingresa la cantidad de dinero que deseas convetir: ",
				"Entrada de valor",JOptionPane.QUESTION_MESSAGE);
		
		Object[] monedas = {"peso(MXN)","Dolar(USD)","Euro",
				"Libra esterlina","Yen Japon�s","Won surcoreano"};
		
		JOptionPane.showMessageDialog(null, monedas);
	}

}
