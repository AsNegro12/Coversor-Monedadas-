package mx.Uriel.MenuPrincipal;

import java.awt.Menu;

import javax.swing.JOptionPane;
import mx.Uriel.ConvesorDeDivisas.VentanasCampioMonedas;
import mx.Uriel.ConversorTemperatura.EntradaDeTemperatura;

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
