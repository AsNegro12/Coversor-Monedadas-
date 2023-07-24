package mx.Uriel.ConversorTemperatura;

import javax.swing.JOptionPane;

import mx.Uriel.ConvesorDeDivisas.CapturaDatos;
import mx.Uriel.MenuPrincipal.ValorMenorA1Exception;

public class EntradaDeTemperatura
{
	private double valorTemperatura;
	
	public static void MostrarVentanaTemp()
	{
		try
		{
			JOptionPane.showInputDialog(null,"Ingresa la temperatura que deseas convertir: ",
					"Entrada de Temperatura",JOptionPane.QUESTION_MESSAGE);
			
		}
		catch(NumberFormatException e)
		{
			JOptionPane.showMessageDialog(null, "Error: Tipo de caracter invalido,"
					+ " Solo se permite números"
					,"Error",JOptionPane.ERROR_MESSAGE);
		}
	}
}
