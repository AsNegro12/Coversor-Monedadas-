package mx.Uriel.TestConversores;
import mx.Uriel.ConvesorDeDivisas.*;
import mx.Uriel.MenuPrincipal.OperacionesDeComversiones;
public class TestConversorMonedas {

	public static void main(String[] args)
	{
		OperacionesDeComversiones test = new OperacionesDeComversiones();
		
		test.setValor(120.12);
		test.ConversionPesosAOtrasMonedas(0);
		test.ConversorOtrasMonedasAPesos(0);
	}

}
