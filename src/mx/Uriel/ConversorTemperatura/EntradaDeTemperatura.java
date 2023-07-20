package mx.Uriel.ConversorTemperatura;

import javax.swing.JOptionPane;

public class EntradaDeTemperatura
{
	public static void MostrarVentanaTemp()
	{
		JOptionPane.showInputDialog(null,"Ingresa la temperatura que deseas convertir: ",
				"Entrada de Temperatura",JOptionPane.QUESTION_MESSAGE);
	}
}
