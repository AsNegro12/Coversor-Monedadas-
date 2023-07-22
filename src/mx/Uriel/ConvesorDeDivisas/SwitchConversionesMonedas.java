package mx.Uriel.ConvesorDeDivisas;

import javax.swing.JOptionPane;

public class SwitchConversionesMonedas
{
	public void switchConversiones(String string,double valor)
	{
		CapturaDatos capturaDatos = new CapturaDatos();
		capturaDatos.setValorMoneda(valor);
		
		switch(string)
		{
		case "De Pesos(MXN) a Dollar(USD)":
			capturaDatos.ConversionPesosAOtrasMonedas(0);
			capturaDatos.ImprimirResuldado(" Dollares(USD)");
			break;
		case "De Pesos(MXN) a Euro":
			capturaDatos.ConversionPesosAOtrasMonedas(1);
			capturaDatos.ImprimirResuldado(" Euros");
			break;
		case "De Pesos(MXN) a Libra Esterlina":
			capturaDatos.ConversionPesosAOtrasMonedas(2);
			capturaDatos.ImprimirResuldado(" Libras Esterlinas");
			break;
		case "De Pesos(MXN) a Yen":
			capturaDatos.ConversionPesosAOtrasMonedas(3);
			capturaDatos.ImprimirResuldado(" Yenes");
			break;
		case "De Pesos(MXN) a Won surcoreano":
			capturaDatos.ConversionPesosAOtrasMonedas(4);
			capturaDatos.ImprimirResuldado("Wones surcoreanos");
			break;
		 default:
			 JOptionPane.showMessageDialog(null, " hola");
		}
	}
}
