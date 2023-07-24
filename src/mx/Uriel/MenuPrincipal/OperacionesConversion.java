package mx.Uriel.MenuPrincipal;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class OperacionesConversion
{
	private double valor;
	private double[] monedas = {16.65,18.80,21.74,0.12,0.013};
	private double resultado;
	
	//dolar(US): 16.65, euro: 18.80, libra: 21.74, yen: 0.12, won: 0.013 valores a 20/jul/2023
	
	public void MandarDatos()
	{
		CapturaDatos CD = new CapturaDatos();
		setValor(CD.getValor());
	}
	
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
		
		public void ImprimirResuldado(String string)
		{
			DecimalFormat decimalFormat = new DecimalFormat("#.00");
			JOptionPane.showMessageDialog(null, "Tienes: $"+
			decimalFormat.format(getResultado())+string);
		}
		
		public double getValor() {
			return valor;
		}

		public void setValor(double valor) {
			this.valor = valor;
		}
		
		public double getResultado() {
			return resultado;
		}
}
