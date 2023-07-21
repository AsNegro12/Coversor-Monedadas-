package mx.Uriel.ConvesorDeDivisas;

import javax.swing.JOptionPane;
import java.util.*;

public class EntradaDeValor
{

	public static void MostrarVentana()
	{	
		boolean entraValida = false;
		double valorMoneda;
		//El tipo de divisa que uso como base para convertir es el peso mexicano
		
		while(!entraValida)
		{
			try
			{
				valorMoneda = Double.parseDouble(JOptionPane.showInputDialog(null,
						"Ingresa la cantidad de dinero que deseas convetir: ",
						"Entrada de valor",JOptionPane.QUESTION_MESSAGE));
				
				CapturaDatos errorMenorA1 = new CapturaDatos();
				errorMenorA1.errorMenorA1(valorMoneda);
				
				
				entraValida = true;
			}
			catch (NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null, "Error: Solo se permite números"
						,"Error",JOptionPane.ERROR_MESSAGE);
			}
			catch(ValorMenorA1Exception e)
			{
				JOptionPane.showMessageDialog(null,"Error: Solo se permiten valores mayores a 1."
						,"Error",JOptionPane.ERROR_MESSAGE);
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "Hola");
		
	}

}
