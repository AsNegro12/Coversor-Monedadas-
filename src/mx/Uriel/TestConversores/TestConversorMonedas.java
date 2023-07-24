package mx.Uriel.TestConversores;
import mx.Uriel.ConvesorDeDivisas.*;
import mx.Uriel.MenuPrincipal.CapturaDatos;
public class TestConversorMonedas {

	public static void main(String[] args)
	{
		CapturaDatos test = new CapturaDatos();
		
		test.setValor(120.12);
		test.ConversionPesosAOtrasMonedas(0);
		test.ConversorOtrasMonedasAPesos(0);
	}

}
