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
				capturaDatos.CelsiusAFarenheit(valor);
				capturaDatos.ImprimirResuldado(" Farenheit", true);
				break;
			case "Celisius a Kelvin":
				capturaDatos.CelsiusAKelvin(valor);
				capturaDatos.ImprimirResuldado(" Kelvin", true);
				break;
			case "Farenheit a Celsius":
				capturaDatos.FarenheitACelsius(valor);
				capturaDatos.ImprimirResuldado(" Celsius", true);
				break;
			case "Farenheit a Kelvin":
				capturaDatos.FarenheitAKelvin(valor);
				capturaDatos.ImprimirResuldado(" Kelvin", true);
				break;
			case "Kelvin a Celisius":
				capturaDatos.KelvinACelsius(valor);
				capturaDatos.ImprimirResuldado(" Celsius", true);
				break;
			case "Kelvin a Farenheit":
				capturaDatos.KelvinAFarenheit(valor);
				capturaDatos.ImprimirResuldado(" Farenheit", true);
				break;
			default:
				JOptionPane.showMessageDialog(null, 
						" hola, Se supone que no deverias ver esto.");
					
		}
	}
}
