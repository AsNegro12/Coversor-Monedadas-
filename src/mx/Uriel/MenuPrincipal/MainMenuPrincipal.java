package mx.Uriel.MenuPrincipal;

public class MainMenuPrincipal
{
	public static void main(String[] args)
	{
		MenuPrincipal menu = new MenuPrincipal();
		menu.VentanaMenuPrincipal();
		
		DeseasHacerOtraTransaccion DHOT = new DeseasHacerOtraTransaccion();
		DHOT.VentanaDeseasContinuar();
	}
}
