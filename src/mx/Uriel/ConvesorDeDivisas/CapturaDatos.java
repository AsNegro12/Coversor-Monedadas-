package mx.Uriel.ConvesorDeDivisas;

public class CapturaDatos
{
	private double valorMoneda = 0;
	
	public void errorMenorA1(double valor) throws ValorMenorA1Exception
	{
		if(valor <= this.valorMoneda)
		{
			throw new ValorMenorA1Exception("Solo se permiten valores mayores a 1.");
		}
		
	}
	
	//dolar(US): 16.65, euro: 18.80, libra: 21.74, yen: 0.12, won: 0.013 valores a 20/jul/2023
	
	public void ConversionMonedas(int valor)
	{
		//dolar(US): 16.65, euro: 18.80, libra: 21.74, 
		//yen: 0.12, won: 0.013 valores a 20/jul/2023
		double[] monedas = {16.65,18.80,21.74,0.12,0.013};
		
		double resultado;
		
		if(valor <= 4)
		{
			resultado = getValorMoneda()/monedas[0];
			System.out.println("resultado: "+resultado);
//			System.out.println(valorMoneda);
//			System.out.println(monedas[valor]);
			
		}
	}

	public double getValorMoneda() {
		return valorMoneda;
	}

	public void setValorMoneda(double valorMoneda) {
		this.valorMoneda = valorMoneda;
	}
	
}
