package mx.Uriel.MenuPrincipal;

import javax.swing.JOptionPane;

public class DeseasHacerOtraTransaccion
{
	public void VentanaDeseasContinuar()
	{
		int respuesta = JOptionPane.showOptionDialog(null,
				"¿Deseas hacer otra Conversión?",
				"Confirmar salida", JOptionPane.YES_NO_OPTION,
				JOptionPane.INFORMATION_MESSAGE, null, null, getClass());
		
		if(respuesta == JOptionPane.YES_OPTION)
		{
			JOptionPane.showMessageDialog(null,"Ok");
			
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Programa terminado");
		}
	}
}
