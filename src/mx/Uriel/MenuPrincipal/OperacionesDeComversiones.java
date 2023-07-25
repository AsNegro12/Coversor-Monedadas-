package mx.Uriel.MenuPrincipal;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class OperacionesDeComversiones
{
	private double valor = 0;
	private double[] monedas = {16.65,18.80,21.74,0.12,0.013};
	private double resultado;
	private String es;

	public void errorMenorA1(double valor) throws ValorMenorA1Exception
	{
		if(valor <= this.valor)
		{
			throw new ValorMenorA1Exception("Solo se permiten valores mayores a 1.");
		}
		
	}
	
	//dolar(US): 16.65, euro: 18.80, libra: 21.74, yen: 0.12, won: 0.013 valores a 20/jul/2023
	
	public void ConversionPesosAOtrasMonedas(int valor)
	{
		//dolar(US): 16.65, euro: 18.80, libra: 21.74, 
		//yen: 0.12, won: 0.013 valores a 20/jul/2023
		
		resultado = getValor()/monedas[valor];	
	}
	
	public void ConversorOtrasMonedasAPesos(int valor)
	{
			resultado = getValor()*monedas[valor];	
	}
	
	public void ImprimirResuldado(String string, boolean valor)
	{
		
		if(valor == false)
		{
			es = "Tienes: $";
		}
		else
		{
			es = "Son: ";
		}
		DecimalFormat decimalFormat = new DecimalFormat("#.00");
		JOptionPane.showMessageDialog(null, es +
		decimalFormat.format(getResultado())+string);
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valorMoneda) {
		this.valor = valorMoneda;
	}
	
	public double getResultado() {
		return resultado;
	}
	
}
