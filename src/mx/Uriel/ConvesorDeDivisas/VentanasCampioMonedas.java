package mx.Uriel.ConvesorDeDivisas;

import javax.swing.JOptionPane;
import java.util.*;

public class VentanasCampioMonedas
{

	CapturaDatos errorMenorA1 = new CapturaDatos();
	boolean entraValida = false;
	double valorMoneda;
	
	public void MostrarVentana()
	{	
		//El tipo de divisa que uso como base para convertir es el peso mexicano
		
		while(!entraValida)
		{
			try
			{
				valorMoneda = Double.parseDouble(JOptionPane.showInputDialog(null,
						"Ingresa la cantidad de dinero que deseas convetir: ",
						"Entrada de valor",JOptionPane.QUESTION_MESSAGE));
				
				errorMenorA1.errorMenorA1(valorMoneda);
				
				entraValida = true;
			}
			catch (NumberFormatException e)
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
	
	public void VentanaMonedas()
	{
		Object[] TipoConversores = {"1","2","3","4","5"};
		
		String OpcionSeleccionada = (String) JOptionPane.showInputDialog(null,
				"Selecciones una opción de conversión.","Menu"
				,JOptionPane.DEFAULT_OPTION, null, TipoConversores, TipoConversores[0]);
		
		MostrarVentana();
	}

}
