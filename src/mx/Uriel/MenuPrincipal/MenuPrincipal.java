package mx.Uriel.MenuPrincipal;

import javax.swing.JOptionPane;

import mx.Uriel.ConversorTemperatura.EntradaDeTemperatura;
import mx.Uriel.ConvesorDeDivisas.VentanasCampioMonedas;

public class MenuPrincipal
{
	public void VentanaMenuPrincipal()
	{
		Object[] TipoConversores = {"Convesor de monedas","Conversor de temperatura"};
		
		String OpcionSeleccionada = (String) JOptionPane.showInputDialog(null,
				"Selecciones una opci�n de conversi�n.","Menu"
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
				EntradaDeTemperatura entradaDeTemperatura = new EntradaDeTemperatura();
				entradaDeTemperatura.MostrarVentanaTemp();
			}
				
		}
	}
}
