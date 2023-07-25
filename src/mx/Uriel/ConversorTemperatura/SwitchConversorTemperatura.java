package mx.Uriel.ConversorTemperatura;

import javax.swing.JOptionPane;

import mx.Uriel.MenuPrincipal.OperacionesDeComversiones;

public class SwitchConversorTemperatura
{
	public void switchConversorTemperatura(String string,double valor)
	{
		OperacionesDeComversiones capturaDatos = new OperacionesDeComversiones();
		capturaDatos.setValor(valor);
		
		switch(string)
		{
			case "Celisius a Farenheit":
				capturaDatos.ImprimirResuldado(" Farenheit", true);
				break;
			case "Celisius a Kelvin":
				capturaDatos.ImprimirResuldado(" Kelvin", true);
				break;
			case "Farenheit a Celsius":
				capturaDatos.ImprimirResuldado(" Kelvin", true);
				break;
			case "Farenheit a Kelvin":
				capturaDatos.ImprimirResuldado(" Kelvin", true);
				break;
			case "Kelvin a Celisius":
				capturaDatos.ImprimirResuldado(" Kelvin", true);
				break;
			case "Kelvin a Farenheit":
				capturaDatos.ImprimirResuldado(" Kelvin", true);
				break;
			default:
				JOptionPane.showMessageDialog(null, 
						" hola, Se supone que no deverias ver esto.");
					
		}
	}
}
