package mx.Uriel.ConvesorDeDivisas;

import javax.swing.JOptionPane;
import java.util.*;

public class VentanasCampioMonedas
{

	CapturaDatos capturaDatos = new CapturaDatos();
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
				
				capturaDatos.errorMenorA1(valorMoneda);
				capturaDatos.setValorMoneda(valorMoneda);
				
				entraValida = true;
			}
			catch (NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null, "Error: Tipo de caracter invalido,"
						+ " Solo se permite n�meros"
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
		ListasConversiones listasM = new ListasConversiones();
		
		listasM.listas("De Pesos(MXN) a Dollar(USD)");
		listasM.listas("De Pesos(MXN) a Euro");
		listasM.listas("De Pesos(MXN) a Libra Esterlina");
//		listasM.listas("De Pesos(MXN) a Yen");
//		listasM.listas("De Pesos(MXN) a Won surcoreano");
//		listasM.listas("De Dollar(USD) a Pesos(MXN)");
//		listasM.listas("De Euro a Pesos(MXN)");
//		listasM.listas("De Libra Esterlina a Pesos(MXN)");
//		listasM.listas("De Yen a Pesos(MXN)");
//		listasM.listas("De Won Surcoreano a Pesos(MXN)");
	
		//String[] opcionesArray = listasM.getOpciones().toArray(new String[0]);
		String[] opcionesArray = new String[listasM.getOpciones().size()];
		opcionesArray = listasM.getOpciones().toArray(opcionesArray);
			
		String opcionSeleccionada = (String) JOptionPane.showInputDialog(
				null,"Seleccione una opci�n:",
                "Men� Desplegable",JOptionPane.PLAIN_MESSAGE,
                null,opcionesArray,opcionesArray[0]);
		
		switch(opcionSeleccionada)
		{
		case "De Pesos(MXN) a Dollar(USD)":
			JOptionPane.showMessageDialog(null, "Dollar(USD)");
			capturaDatos.ConversionPesosAOtrasMonedas(0);
			break;
		 default:
			 JOptionPane.showMessageDialog(null, "hola");
		}
	}

}
