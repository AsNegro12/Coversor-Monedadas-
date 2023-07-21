package mx.Uriel.MenuPrincipal;

import javax.swing.JOptionPane;
import mx.Uriel.ConvesorDeDivisas.VentanasCampioMonedas;
import mx.Uriel.ConvesorDeDivisas.ValorMenorA1Exception;
import mx.Uriel.ConversorTemperatura.EntradaDeTemperatura;

public class MenuPrincipal
{
	public static void main(String[] args)
	{
		Object[] TipoConversores = {"Convesor de monedas","Conversor de temperatura"};
		
		String OpcionSeleccionada = (String) JOptionPane.showInputDialog(null,
				"Selecciones una opción de conversión.","Menu"
				,JOptionPane.DEFAULT_OPTION, null, TipoConversores, TipoConversores[0]);
		
		if(OpcionSeleccionada != null)
		{
			//JOptionPane.showMessageDialog(null,"Elegiste "+OpcionSeleccionada+".");
			if(OpcionSeleccionada.equals(TipoConversores[0]))
			{
				
				VentanasCampioMonedas entradaDeValor = new VentanasCampioMonedas();
				entradaDeValor.MostrarVentana();
			}
			else
			{
				EntradaDeTemperatura.MostrarVentanaTemp();
			}
				
		}
	}
}
