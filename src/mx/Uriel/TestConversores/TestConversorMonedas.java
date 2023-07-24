package mx.Uriel.TestConversores;
import mx.Uriel.ConvesorDeDivisas.*;
import mx.Uriel.MenuPrincipal.OperacionesConversion;
public class TestConversorMonedas {

	public static void main(String[] args)
	{
		OperacionesConversion test = new OperacionesConversion();
		
		test.setValor(120.12);
		test.ConversionPesosAOtrasMonedas(0);
		test.ConversorOtrasMonedasAPesos(0);
	}

}
