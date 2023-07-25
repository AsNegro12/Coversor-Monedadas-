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
		if(valor <= this.valor)//Aqui comprueba si valor es menor igual a 0.
		{
			//Si lo se lanza el siguiente mesaje.
			throw new ValorMenorA1Exception("Solo se permiten valores mayores a 1.");
		}
		
	}
	//
	//Las siguientes funciones hace conversiones de de monedas
	//
	//Aqui se hacer conversion de pesos(MXN) a otras monedas.
	public void ConversionPesosAOtrasMonedas(int valor)
	{
		//dolar(US): 16.65, euro: 18.80, libra: 21.74, 
		//yen: 0.12, won: 0.013 valores a 20/jul/2023
		
		resultado = getValor()/monedas[valor];	
	}
	
	//Aqui se hacer conversion de otras monedas a pesos(MXN).
	public void ConversorOtrasMonedasAPesos(int valor)
	{
			resultado = getValor()*monedas[valor];	
	}
	//
	//Las siguientes funciones hace conversiones de temperatura
	//
	public void CelsiusAFarenheit(double valor)
	{
		resultado = ((getValor()*9)/5)+32;
	}
	
	public void CelsiusAKelvin(double valor)
	{
		resultado = getValor()+273.15;
	}
	
	public void FarenheitACelsius(double valor)
	{
		resultado = ((getValor()-32)*5)/9;
	}
	
	public void FarenheitAKelvin(double valor)
	{
		resultado = (((getValor()-32)*5)/9)+273.15;
	}
	
	public void KelvinACelsius(double valor)
	{
		resultado = getValor()-273.15;
	}
	
	public void KelvinAFarenheit(double valor)
	{
		resultado = (((getValor()-273.15)*9)/5)+32;
	}
	
	//Esta funcion imprime los resultados de las conversiones
	public void ImprimirResuldado(String string, boolean valor)
	{
		/*
		 *  Este if se usa para saber si la conversion es de monedas o temperaturas.
		 *  Si es false asigna el valor "Tienes: $" para conversiones de monedas.
		 *  y sino "Son: " para converosres de temperatura.
		 */
		if(valor == false)
		{
			es = "Tienes: $";
		}
		else
		{
			es = "Son: ";
		}
		// Crear una instancia de DecimalFormat para formatear números con dos decimales
		DecimalFormat decimalFormat = new DecimalFormat("#.00");
		/*
		 * Muestra una ventana emergente (cuadro de diálogo), utiliza JOptionPane
		 *con el resultado formateado usando el DecimalFormat
		 * y añadiendo el valor de String es.
		 *El resultado se mostrará con dos decimales debido a la configuración del 
		 *DecimalFormat.
		 */
		JOptionPane.showMessageDialog(null, es +
		decimalFormat.format(getResultado())+string);
	}
	//
	//Y por ultimo se muestra los gets y sets.
	//
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
