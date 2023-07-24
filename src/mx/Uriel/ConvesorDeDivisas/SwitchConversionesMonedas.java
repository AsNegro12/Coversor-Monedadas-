package mx.Uriel.ConvesorDeDivisas;

import javax.swing.JOptionPane;

import mx.Uriel.MenuPrincipal.*;

public class SwitchConversionesMonedas
{
	public void switchConversiones(String string,double valor)
	{
		OperacionesConversion OC = new OperacionesConversion();
		OC.setValor(valor);
		
		switch(string)
		{
		case "De Pesos(MXN) a Dollar(USD)":
			OC.ConversionPesosAOtrasMonedas(0);
			OC.ImprimirResuldado(" Dollares(USD)");
			break;
		case "De Pesos(MXN) a Euro":
			OC.ConversionPesosAOtrasMonedas(1);
			OC.ImprimirResuldado(" Euros");
			break;
		case "De Pesos(MXN) a Libra Esterlina":
			OC.ConversionPesosAOtrasMonedas(2);
			OC.ImprimirResuldado(" Libras Esterlinas");
			break;
		case "De Pesos(MXN) a Yen":
			OC.ConversionPesosAOtrasMonedas(3);
			OC.ImprimirResuldado(" Yenes");
			break;
		case "De Pesos(MXN) a Won surcoreano":
			OC.ConversionPesosAOtrasMonedas(4);
			OC.ImprimirResuldado(" Wones surcoreanos");
			break;
			//
			//
		case "De Dollar(USD) a Pesos(MXN)":
			OC.ConversorOtrasMonedasAPesos(0);
			OC.ImprimirResuldado(" Pesos(MXN)");
			break;
		case "De Euro a Pesos(MXN)":
			OC.ConversorOtrasMonedasAPesos(1);
			OC.ImprimirResuldado(" Pesos(MXN)");
			break;
		case "De Libra Esterlina a Pesos(MXN)":
			OC.ConversorOtrasMonedasAPesos(2);
			OC.ImprimirResuldado(" Pesos(MXN)");
			break;
		case "De Yen a Pesos(MXN)":
			OC.ConversorOtrasMonedasAPesos(3);
			OC.ImprimirResuldado(" Pesos(MXN)");
			break;
		case "De Won Surcoreano a Pesos(MXN)":
			OC.ConversorOtrasMonedasAPesos(4);
			OC.ImprimirResuldado(" Pesos(MXN)");
			break;
		 default:
			 JOptionPane.showMessageDialog(null, 
					 " hola, Se supone que no deverias ver esto.");
		}
	}
}
