package mx.Uriel.ConvesorDeDivisas;

import javax.swing.JOptionPane;
import java.util.*;

public class VentanasCampioMonedas
{

	CapturaDatos errorMenorA1 = new CapturaDatos();
	ListasConversiones listasM = new ListasConversiones();
	private boolean entraValida = false;
	private double valorMoneda;
	
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
		
		VentanaMonedas();
		
	}
	
	public void VentanaMonedas()
	{    
		listasM.listas(0, "De Pesos(MXN) a Dollar(USD)");
		listasM.listas(1, "De Pesos(MXN) a Euro");
		listasM.listas(2, "De Pesos(MXN) a Libra Esterlina");
		listasM.listas(3, "De Pesos(MXN) a Yen");
		listasM.listas(4, "De Pesos(MXN) a Won surcoreano");
		listasM.listas(5, "De Dollar(USD) a Pesos(MXN)");
		listasM.listas(6, "De Pesos(MXN) a Euro");
		listasM.listas(7, "De Libra Esterlina a Pesos(MXN)");
		listasM.listas(8, "De Yen a Pesos(MXN)");
		listasM.listas(9, "De Won Surcoreano a Pesos(MXN)");
	
		String[] opcionesArray = listasM.getOpciones().toArray(new String[0]);
		
		String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione una opción:",
                "Menú Desplegable",
                JOptionPane.PLAIN_MESSAGE,
                null,
                opcionesArray,
                opcionesArray[0] // Opción predeterminada
                );
		
		if (opcionSeleccionada != null)
		{
            JOptionPane.showMessageDialog(null, "Opción seleccionada: " 
            								+ opcionSeleccionada);
        }
	}

}
