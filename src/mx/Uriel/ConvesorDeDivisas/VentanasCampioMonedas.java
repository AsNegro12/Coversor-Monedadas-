package mx.Uriel.ConvesorDeDivisas;

import javax.swing.JOptionPane;
import java.util.*;

public class VentanasCampioMonedas
{

	CapturaDatos errorMenorA1 = new CapturaDatos();
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
//		List<String> opciones = new ArrayList<>();
//      opciones.add("De Pesos(MXN) a Dollar(USD)");
//      opciones.add("De Pesos(MXN) a Euro");
//      opciones.add("De Pesos(MXN) a Libra Esterlina");
//      opciones.add("De Pesos(MXN) a yen");
//      opciones.add("De Pesos(MXN) a Won surcoreano");
//		opciones.add("De Dollar(USD) a Pesos(MXN)");
//      opciones.add("De Euro a Pesos(MXN)");
//      opciones.add("De Libra Esterlina a Pesos(MXN)");
//      opciones.add("De Yen a Pesos(MXN)");
//      opciones.add("De Won Surcoreano a Pesos(MXN)");
//        
//        String[] opcionesDeMonedas = opciones.toArray(new String[0]);
//        
//        String opcionSeleccionada = (String) JOptionPane.showInputDialog(
//                null,
//                "Seleccione a la moneda que desea convertir:",
//                "Menú de monedas",
//                JOptionPane.PLAIN_MESSAGE,
//                null,
//                opcionesDeMonedas,
//                opcionesDeMonedas[0] // Opción predeterminada
//        );
//        
//        if (opcionSeleccionada != null)
//        {
//            JOptionPane.showMessageDialog(null, "Opción seleccionada: " 
//            								+ opcionSeleccionada);
//        }
	}

}
