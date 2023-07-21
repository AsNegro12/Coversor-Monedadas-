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
}
