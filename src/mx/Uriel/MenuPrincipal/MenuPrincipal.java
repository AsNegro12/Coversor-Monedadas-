package mx.Uriel.MenuPrincipal;

import javax.swing.JOptionPane;

public class MenuPrincipal
{
	public static void main(String[] args)
	{
		Object[] TipoConversores = {"Convesor de monedas. ","Conversor de temperatura. "};
		
		JOptionPane.showInputDialog(null,"Selecciones una opci�n de conversi�n.","Menu"
				,JOptionPane.DEFAULT_OPTION, null, TipoConversores, TipoConversores[0]);
	}
}
