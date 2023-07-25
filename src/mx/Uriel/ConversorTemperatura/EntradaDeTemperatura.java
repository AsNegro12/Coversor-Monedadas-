package mx.Uriel.ConversorTemperatura;

import javax.swing.JOptionPane;
import mx.Uriel.MenuPrincipal.OperacionesDeComversiones;
import mx.Uriel.MenuPrincipal.GeneradorDeListas;

public class EntradaDeTemperatura
{
	OperacionesDeComversiones capturaDatos = new OperacionesDeComversiones();
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
				
				capturaDatos.setValor(valorTemperatura);
				break;
				
			}
			catch(NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null, "Error: Tipo de caracter invalido,"
						+ " Solo se permite números"
						,"Error",JOptionPane.ERROR_MESSAGE);
			}
		}
		
		VentanaTipoTemperaduras();
		
	}
	
	public void VentanaTipoTemperaduras()
	{
		GeneradorDeListas listasT = new GeneradorDeListas();
		
		listasT.listas("Celisius a Farenheit");
		listasT.listas("Celisius a Kelvin");
		listasT.listas("Farenheit a Celsius");
		listasT.listas("Farenheit a Kelvin");
		listasT.listas("Kelvin a Celisius");
		listasT.listas("Kelvin a Farenheit");
		
		String[] opcionesArray = new String[listasT.getOpciones().size()];
		opcionesArray = listasT.getOpciones().toArray(opcionesArray);
			
		String opcionSeleccionada = (String) JOptionPane.showInputDialog(
				null,"Seleccione una opción:",
                "Menú Desplegable",JOptionPane.PLAIN_MESSAGE,
                null,opcionesArray,opcionesArray[0]);
		
		SwitchConversorTemperatura ST = new SwitchConversorTemperatura();
		ST.switchConversorTemperatura(opcionSeleccionada, valorTemperatura);
	}
}
