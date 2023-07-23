package mx.Uriel.ConvesorDeDivisas;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class CapturaDatos
{
	private double valorMoneda = 0;
	private double[] monedas = {16.65,18.80,21.74,0.12,0.013};
	private double resultado;

	public void errorMenorA1(double valor) throws ValorMenorA1Exception
	{
		if(valor <= this.valorMoneda)
		{
			throw new ValorMenorA1Exception("Solo se permiten valores mayores a 1.");
		}
		
	}
	
	//dolar(US): 16.65, euro: 18.80, libra: 21.74, yen: 0.12, won: 0.013 valores a 20/jul/2023
	
	public void ConversionPesosAOtrasMonedas(int valor)
	{
		//dolar(US): 16.65, euro: 18.80, libra: 21.74, 
		//yen: 0.12, won: 0.013 valores a 20/jul/2023
		
		resultado = getValorMoneda()/monedas[valor];	
	}
	
	public void ConversorOtrasMonedasAPesos(int valor)
	{
			resultado = getValorMoneda()*monedas[valor];	
	}
	
	public void ImprimirResuldado(String string)
	{
		DecimalFormat decimalFormat = new DecimalFormat("#.00");
		JOptionPane.showMessageDialog(null, "Tienes: $"+
		decimalFormat.format(getResultado())+string);
	}

	public double getValorMoneda() {
		return valorMoneda;
	}

	public void setValorMoneda(double valorMoneda) {
		this.valorMoneda = valorMoneda;
	}
	
	public double getResultado() {
		return resultado;
	}
	
}
