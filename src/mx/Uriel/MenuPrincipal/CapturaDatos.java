package mx.Uriel.MenuPrincipal;

public class CapturaDatos
{
	private double valor;
	
	public void errorMenorA1(double valor) throws ValorMenorA1Exception
	{
		if(valor <= this.valor)
		{
			throw new ValorMenorA1Exception("Solo se permiten valores mayores a 1.");
		}
		
	}

	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	

}
