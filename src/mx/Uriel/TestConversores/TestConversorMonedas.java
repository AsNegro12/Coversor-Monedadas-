package mx.Uriel.TestConversores;
import mx.Uriel.ConvesorDeDivisas.*;
public class TestConversorMonedas {

	public static void main(String[] args)
	{
		CapturaDatos test = new CapturaDatos();
		
		test.setValorMoneda(2000);
		test.ConversionMonedas(3);
		
		
	}

}
