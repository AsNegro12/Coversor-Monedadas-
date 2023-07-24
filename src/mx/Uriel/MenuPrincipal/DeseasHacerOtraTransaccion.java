package mx.Uriel.MenuPrincipal;

import javax.swing.JOptionPane;

public class DeseasHacerOtraTransaccion
{
	public void VentanaDeseasContinuar()
	{
		while(true)
		{
			int respuesta = JOptionPane.showOptionDialog(null,
					"¿Deseas hacer otra Conversión?",
					"Confirmar salida", JOptionPane.YES_NO_OPTION,
					JOptionPane.INFORMATION_MESSAGE, null, 
					new Object[]{"Sí", "No"}, "Sí");
			
			boolean flag = false;
			
			if(respuesta == JOptionPane.YES_OPTION)
			{
				
					MenuPrincipal menu = new MenuPrincipal();
					menu.VentanaMenuPrincipal();
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Programa terminado");
				break;
			}
		}
	}
}
