package mx.Uriel.TestConversores;
import mx.Uriel.ConvesorDeDivisas.*;
public class TestConversorMonedas {

	public static void main(String[] args)
	{
		CapturaDatos test = new CapturaDatos();
		
		test.setValorMoneda(120.12);
		test.ConversionPesosAOtrasMonedas(0);
		test.ConversorOtrasMonedasAPesos(0);
	}

}
