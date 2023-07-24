package mx.Uriel.ConversorTemperatura;

import javax.swing.JOptionPane;
import mx.Uriel.MenuPrincipal.CapturaDatos;
import mx.Uriel.MenuPrincipal.ListasConversiones;
import mx.Uriel.MenuPrincipal.ValorMenorA1Exception;

public class EntradaDeTemperatura
{
	CapturaDatos capturaDatos = new CapturaDatos();
	private double valorTemperatura;
	
	public void MostrarVentanaTemp()
	{
		while(true)
		{
			try
			{
				valorTemperatura = Double.parseDouble(JOptionPane.showInputDialog(null,
						"Ingresa la temperatura que deseas convertir: ",
						"Entrada de Temperatura",JOptionPane.QUESTION_MESSAGE));
				
				capturaDatos.errorMenorA1(valorTemperatura);
				capturaDatos.setValor(valorTemperatura);
				break;
				
			}
			catch(NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null, "Error: Tipo de caracter invalido,"
						+ " Solo se permite números"
						,"Error",JOptionPane.ERROR_MESSAGE);
			}
			catch(ValorMenorA1Exception e)
			{
				JOptionPane.showMessageDialog(null,"Error: Solo se permiten valores mayores a 1."
						,"Error",JOptionPane.ERROR_MESSAGE);
			}
		}
		
	}
}
