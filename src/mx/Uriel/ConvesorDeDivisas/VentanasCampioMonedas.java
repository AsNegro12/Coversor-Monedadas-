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
		List<String> opciones = new ArrayList<>();
        opciones.add("Peso(MXN)");
        opciones.add("Dolas(USD)");
        opciones.add("Euro");
        opciones.add("Libra Esterlina");
        opciones.add("yen");
        opciones.add("Won surcoreano");
        
        String[] opcionesDeMonedas = opciones.toArray(new String[0]);
        
        String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione a la moneda que desea convertir:",
                "Menú de monedas",
                JOptionPane.PLAIN_MESSAGE,
                null,
                opcionesDeMonedas,
                opcionesDeMonedas[0] // Opción predeterminada
        );
        
        if (opcionSeleccionada != null)
        {
            JOptionPane.showMessageDialog(null, "Opción seleccionada: " 
            								+ opcionSeleccionada);
        }
	}

}
