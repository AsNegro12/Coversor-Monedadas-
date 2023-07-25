package mx.Uriel.ConvesorDeDivisas;

import javax.swing.JOptionPane;

import mx.Uriel.MenuPrincipal.OperacionesDeComversiones;

public class SwitchConversionesMonedas
{
	public void switchConversiones(String string,double valor)
	{
		OperacionesDeComversiones capturaDatos = new OperacionesDeComversiones();
		capturaDatos.setValor(valor);
		
		switch(string)
		{
		case "De Pesos(MXN) a Dollar(USD)":
			capturaDatos.ConversionPesosAOtrasMonedas(0);
			capturaDatos.ImprimirResuldado(" Dollares(USD)",false);
			break;
		case "De Pesos(MXN) a Euro":
			capturaDatos.ConversionPesosAOtrasMonedas(1);
			capturaDatos.ImprimirResuldado(" Euros",false);
			break;
		case "De Pesos(MXN) a Libra Esterlina":
			capturaDatos.ConversionPesosAOtrasMonedas(2);
			capturaDatos.ImprimirResuldado(" Libras Esterlinas",false);
			break;
		case "De Pesos(MXN) a Yen":
			capturaDatos.ConversionPesosAOtrasMonedas(3);
			capturaDatos.ImprimirResuldado(" Yenes",false);
			break;
		case "De Pesos(MXN) a Won surcoreano":
			capturaDatos.ConversionPesosAOtrasMonedas(4);
			capturaDatos.ImprimirResuldado(" Wones surcoreanos",false);
			break;
			//
			//
		case "De Dollar(USD) a Pesos(MXN)":
			capturaDatos.ConversorOtrasMonedasAPesos(0);
			capturaDatos.ImprimirResuldado(" Pesos(MXN)",false);
			break;
		case "De Euro a Pesos(MXN)":
			capturaDatos.ConversorOtrasMonedasAPesos(1);
			capturaDatos.ImprimirResuldado(" Pesos(MXN)",false);
			break;
		case "De Libra Esterlina a Pesos(MXN)":
			capturaDatos.ConversorOtrasMonedasAPesos(2);
			capturaDatos.ImprimirResuldado(" Pesos(MXN)",false);
			break;
		case "De Yen a Pesos(MXN)":
			capturaDatos.ConversorOtrasMonedasAPesos(3);
			capturaDatos.ImprimirResuldado(" Pesos(MXN)",false);
			break;
		case "De Won Surcoreano a Pesos(MXN)":
			capturaDatos.ConversorOtrasMonedasAPesos(4);
			capturaDatos.ImprimirResuldado(" Pesos(MXN)",false);
			break;
		 default:
			 JOptionPane.showMessageDialog(null, 
					 " hola, Se supone que no deverias ver esto.");
		}
	}
}
